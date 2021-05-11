package com.zuehlke.petclinic.Services;

import com.zuehlke.petclinic.Models.Owner;

import java.util.Set;

public interface OwnerService {

    public Owner findByLastName(String lastName);

    public Owner findById(Long id);

    public Owner save(Owner owner);

    public Set<Owner> findAll();

}
