package com.zuehlke.petclinic.Services;

import com.zuehlke.petclinic.Models.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);

    Vet save(Vet vet);

}
