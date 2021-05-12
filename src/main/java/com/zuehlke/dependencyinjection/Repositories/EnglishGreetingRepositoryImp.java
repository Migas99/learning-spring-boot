package com.zuehlke.dependencyinjection.Repositories;

public class EnglishGreetingRepositoryImp implements EnglishGreetingRepository {

    @Override
    public String sayGreeting() {
        return "Hello World --- EN";
    }

}
