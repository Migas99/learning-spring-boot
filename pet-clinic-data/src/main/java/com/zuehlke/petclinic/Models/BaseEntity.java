package com.zuehlke.petclinic.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BaseEntity implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public BaseEntity() {
        super();
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
