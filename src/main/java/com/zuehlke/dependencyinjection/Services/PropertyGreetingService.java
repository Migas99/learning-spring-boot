package com.zuehlke.dependencyinjection.Services;

import org.springframework.stereotype.Service;

//@Service
public class PropertyGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Property";
    }
}
