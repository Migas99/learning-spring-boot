package com.zuehlke.petclinic.Services.Maps;

import com.zuehlke.petclinic.Models.Vet;
import com.zuehlke.petclinic.Services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet> implements VetService {

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }

}
