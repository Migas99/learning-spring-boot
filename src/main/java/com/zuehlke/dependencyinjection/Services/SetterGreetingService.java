package com.zuehlke.dependencyinjection.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
