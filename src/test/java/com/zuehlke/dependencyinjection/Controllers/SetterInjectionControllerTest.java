package com.zuehlke.dependencyinjection.Controllers;

import com.zuehlke.dependencyinjection.Services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {

    SetterInjectionController controller;

    @BeforeEach
    void setUp() {
        this.controller = new SetterInjectionController();
        this.controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}