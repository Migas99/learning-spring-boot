package com.zuehlke.dependencyinjection.Configuration;

import com.springframework.pets.CatPetService;
import com.springframework.pets.DogPetService;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PetServiceConfig {

    @Bean
    public PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"Dog", "default"})
    @Bean("petService")
    public PetService dogPetService(PetServiceFactory factory) {
        return factory.getPetService(new DogPetService().getPetType());
    }

    @Profile({"Cat"})
    @Bean("petService")
    public PetService catPerService(PetServiceFactory factory) {
        return factory.getPetService(new CatPetService().getPetType());
    }

}
