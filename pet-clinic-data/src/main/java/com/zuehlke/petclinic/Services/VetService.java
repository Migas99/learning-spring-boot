package com.zuehlke.petclinic.Services;

import com.zuehlke.petclinic.Models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
