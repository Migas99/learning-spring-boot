package com.zuehlke.petclinic.Services;

import com.zuehlke.petclinic.Models.Pet;

public interface PetService extends CrudService<Pet, Long> {

    Pet findByPetName(String name);

    Pet save(Pet pet);

}
