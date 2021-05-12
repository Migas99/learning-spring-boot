package com.zuehlke.dependencyinjection.Services;

import com.zuehlke.dependencyinjection.Repositories.EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("EN")
//@Service("i18nService")
public class I18EnglishGreetingService implements IGreetingService {

    private final EnglishGreetingRepository repository;

    public I18EnglishGreetingService(EnglishGreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return this.repository.sayGreeting();
    }

}
