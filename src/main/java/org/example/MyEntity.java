package org.example;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class MyEntity extends PanacheEntity {
    public String field;
    public String foo;
    public long bar;

    @OneToOne
    @JoinColumn(name = "related_entity_id")
    public MyRelatedEntity myRelatedEntity;
}
