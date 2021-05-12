package com.zuehlke.petclinic.Models;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private String name;
    private LocalDate birthDate;
    private PetType petType;
    private Owner owner;

    public Pet() {
        super();
    }

    public Pet(String name, LocalDate birthDate, PetType type, Owner owner) {
        super();
        this.name = name;
        this.birthDate = birthDate;
        this.petType = type;
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
