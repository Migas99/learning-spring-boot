package com.zuehlke.petclinic.Services.Maps;

import com.zuehlke.petclinic.Models.Owner;
import com.zuehlke.petclinic.Services.OwnerService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

}
