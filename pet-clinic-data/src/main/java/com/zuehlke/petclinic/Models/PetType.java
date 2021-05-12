package com.zuehlke.petclinic.Models;

public class PetType extends BaseEntity {

    private String type;

    public PetType() {
    }

    public PetType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
