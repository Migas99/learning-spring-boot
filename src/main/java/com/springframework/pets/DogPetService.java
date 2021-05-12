package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service
//@Profile({"Dog", "default"})
public class DogPetService implements PetService {

    private final String type = "Dog";

    @Override
    public String getPetType() {
        return this.type;
    }
}
