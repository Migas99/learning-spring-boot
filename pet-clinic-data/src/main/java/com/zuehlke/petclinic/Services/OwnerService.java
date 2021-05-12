package com.zuehlke.petclinic.Services;

import com.zuehlke.petclinic.Models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

}
