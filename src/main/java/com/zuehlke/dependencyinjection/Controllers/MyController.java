package com.zuehlke.dependencyinjection.Controllers;

import com.zuehlke.dependencyinjection.Services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final IGreetingService greetingService;

    public MyController(IGreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }

}
