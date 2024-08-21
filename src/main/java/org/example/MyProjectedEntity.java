package org.example;

public record MyProjectedEntity(
        long id,
        String field,
        long bar,
        MyRelatedEntity myRelatedEntity
) {
}
