package com.springframework.pets;

import org.springframework.stereotype.Service;

//@Service
public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType) {
            case "Dog":
                return new DogPetService();
            case "Cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }

}
