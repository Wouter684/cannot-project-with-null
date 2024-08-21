package org.example;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class MyRelatedEntity extends PanacheEntity {
    public String fieldName;
}
