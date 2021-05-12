package com.zuehlke.petclinic.Services.Maps;

import com.zuehlke.petclinic.Models.Pet;
import com.zuehlke.petclinic.Services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet findByPetName(String name) {
        return null;
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }
}
