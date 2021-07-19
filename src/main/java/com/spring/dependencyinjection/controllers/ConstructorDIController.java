package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorDIController {

    private final GreetingService greetingService;

    public ConstructorDIController(@Qualifier("constructorService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        System.out.println(greetingService.sayHello());
    }
}
