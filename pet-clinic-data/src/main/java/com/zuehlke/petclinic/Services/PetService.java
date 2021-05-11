package com.zuehlke.petclinic.Services;

import com.zuehlke.petclinic.Models.Pet;

import java.util.Set;

public interface PetService {

    public Pet findById(Long id);

    public Pet save(Pet pet);

    public Set<Pet> findAll();

}
