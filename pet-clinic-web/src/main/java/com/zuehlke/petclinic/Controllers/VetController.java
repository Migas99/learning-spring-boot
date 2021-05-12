package com.zuehlke.petclinic.Controllers;

import com.zuehlke.petclinic.Services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vet", "/vets", "/vets/index", "/vets/index.html"})
    public String vetsList(Model model) {
        model.addAttribute("vets", this.vetService.findAll());
        return "vets/index";
    }

}
