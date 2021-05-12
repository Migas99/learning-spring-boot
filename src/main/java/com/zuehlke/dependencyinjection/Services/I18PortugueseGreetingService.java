package com.zuehlke.dependencyinjection.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"PT", "default"})
//@Service("i18nService")
public class I18PortugueseGreetingService implements IGreetingService {

    @Override
    public String sayGreeting() {
        return "Olá mundo -- Português";
    }

}
