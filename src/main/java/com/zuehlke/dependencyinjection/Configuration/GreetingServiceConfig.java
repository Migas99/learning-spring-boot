package com.zuehlke.dependencyinjection.Configuration;

import com.zuehlke.dependencyinjection.Services.ConstructorGreetingService;
import com.zuehlke.dependencyinjection.Services.PropertyGreetingService;
import com.zuehlke.dependencyinjection.Services.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    public PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    public SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }

}
