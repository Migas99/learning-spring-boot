package com.zuehlke.dependencyinjection;

import com.zuehlke.dependencyinjection.Controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.zuehlke.dependencyinjection", "com.springframework.pets"})
@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("----- The Best Pet is ------");
        System.out.println(petController.whichPetIsTheBest());

        System.out.println("------ I18n");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("------ Primary");
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println("------ Property");
        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("------ Setting");
        SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
        System.out.println(setterInjectionController.getGreeting());

        System.out.println("------ Constructor");
        ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
        System.out.println(constructorInjectionController.getGreeting());
    }

}
