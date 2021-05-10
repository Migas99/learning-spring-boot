package com.zuehlke.dependencyinjection.Controllers;

import com.zuehlke.dependencyinjection.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final IGreetingService greetingService;

    public I18nController(@Qualifier("i18nService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }

}
