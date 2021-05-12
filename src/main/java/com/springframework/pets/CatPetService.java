package com.springframework.pets;

import org.springframework.stereotype.Service;

@Service
public class CatPetService implements PetService {

    private final String type = "Cat";

    @Override
    public String getPetType() {
        return this.type;
    }

}
