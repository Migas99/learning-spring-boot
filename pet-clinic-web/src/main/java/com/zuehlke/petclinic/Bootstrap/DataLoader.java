package com.zuehlke.petclinic.Bootstrap;

import com.zuehlke.petclinic.Models.Owner;
import com.zuehlke.petclinic.Models.Vet;
import com.zuehlke.petclinic.Services.Maps.OwnerMapService;
import com.zuehlke.petclinic.Services.Maps.VetMapService;
import com.zuehlke.petclinic.Services.OwnerService;
import com.zuehlke.petclinic.Services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("Michael", "Weston");
        this.ownerService.save(owner1);

        Owner owner2 = new Owner("Fiona", "Stuart");
        this.ownerService.save(owner2);

        System.out.println("Loaded owners ... ");

        Vet vet1 = new Vet("Sam", "Knoxville");
        this.vetService.save(vet1);

        Vet vet2 = new Vet("Joana", "Armstrong");
        this.vetService.save(vet2);

        System.out.println("Loaded vets ... ");
    }

}
