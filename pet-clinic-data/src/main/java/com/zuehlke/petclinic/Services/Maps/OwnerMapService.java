package com.zuehlke.petclinic.Services.Maps;

import com.zuehlke.petclinic.Models.Owner;
import com.zuehlke.petclinic.Services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

}
