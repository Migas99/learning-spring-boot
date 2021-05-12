package com.zuehlke.petclinic.Services.Maps;

import com.zuehlke.petclinic.Models.Pet;
import com.zuehlke.petclinic.Services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet> implements PetService {

    @Override
    public Pet findByPetName(String name) {
        return null;
    }

}
