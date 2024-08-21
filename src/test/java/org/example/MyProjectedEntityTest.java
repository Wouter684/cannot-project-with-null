package org.example;

import org.junit.jupiter.api.Test;

import io.quarkus.panache.common.Sort;
import io.quarkus.test.junit.QuarkusTest;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class MyProjectedEntityTest {
    @Test
    void canProjectWithNull() {
        var projectedEntityList = MyEntity.findAll(Sort.by("id")).project(MyProjectedEntity.class).list();

        assertEquals(3, projectedEntityList.size());

        assertEquals("field-1", projectedEntityList.getFirst().field());
        assertEquals("field-2", projectedEntityList.get(1).field());
        assertNull(projectedEntityList.getLast().field());
    }
}