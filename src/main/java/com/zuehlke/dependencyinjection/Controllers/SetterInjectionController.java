package com.zuehlke.dependencyinjection.Controllers;

import com.zuehlke.dependencyinjection.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private IGreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
