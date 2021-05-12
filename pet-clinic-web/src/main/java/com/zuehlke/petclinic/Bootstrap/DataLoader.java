package com.zuehlke.petclinic.Bootstrap;

import com.zuehlke.petclinic.Models.Owner;
import com.zuehlke.petclinic.Models.Vet;
import com.zuehlke.petclinic.Services.Maps.OwnerMapService;
import com.zuehlke.petclinic.Services.Maps.VetMapService;
import com.zuehlke.petclinic.Services.OwnerService;
import com.zuehlke.petclinic.Services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("Michael", "Weston");
        System.out.println(owner1.getId());
        this.ownerService.save(owner1);

        Owner owner2 = new Owner("Fiona", "Stuart");
        System.out.println(owner2.getId());
        this.ownerService.save(owner2);

        System.out.println("Loaded owners ... ");

        Vet vet1 = new Vet("Sam", "Knoxville");
        this.vetService.save(vet1);

        Vet vet2 = new Vet("Joana", "Armstrong");
        this.vetService.save(vet2);

        System.out.println("Loaded vets ... ");
    }

}
