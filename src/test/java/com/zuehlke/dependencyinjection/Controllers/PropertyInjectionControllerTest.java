package com.zuehlke.dependencyinjection.Controllers;

import com.zuehlke.dependencyinjection.Services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        this.controller = new PropertyInjectionController();
        this.controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }

}