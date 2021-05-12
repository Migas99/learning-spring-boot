package com.zuehlke.dependencyinjection.Configuration;

import com.zuehlke.dependencyinjection.Repositories.EnglishGreetingRepository;
import com.zuehlke.dependencyinjection.Repositories.EnglishGreetingRepositoryImp;
import com.zuehlke.dependencyinjection.Services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile({"PT", "default"})
    @Bean("i18nService")
    public I18PortugueseGreetingService i18PortugueseGreetingService() {
        return new I18PortugueseGreetingService();
    }

    @Bean
    public EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImp();
    }

    @Profile({"EN"})
    @Bean("i18nService")
    public I18EnglishGreetingService i18EnglishGreetingService(EnglishGreetingRepository repository) {
        return new I18EnglishGreetingService(repository);
    }

    @Primary
    @Bean
    public PrimaryGreetingService greetingService() {
        return new PrimaryGreetingService();
    }

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
