package com.zuehlke.petclinic.Services;

import com.zuehlke.petclinic.Models.Vet;

import java.util.Set;

public interface VetService {

    public Vet findById(Long id);

    public Vet save(Vet vet);

    public Set<Vet> findAll();

}
