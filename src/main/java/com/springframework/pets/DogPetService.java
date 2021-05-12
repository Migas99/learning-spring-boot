package com.springframework.pets;

import org.springframework.stereotype.Service;

@Service
public class DogPetService implements PetService {

    private final String type = "Dog";

    @Override
    public String getPetType() {
        return this.type;
    }
}
