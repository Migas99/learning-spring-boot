package com.zuehlke.petclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owner", "/owners", "/owners/index", "/owners/index.html"})
    public String ownersList() {
        return "owners/index";
    }

}
