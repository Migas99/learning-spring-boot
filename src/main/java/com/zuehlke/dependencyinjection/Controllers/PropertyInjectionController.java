package com.zuehlke.dependencyinjection.Controllers;

import com.zuehlke.dependencyinjection.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public IGreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
