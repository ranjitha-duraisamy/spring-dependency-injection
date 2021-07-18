package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingService;

public class ConstructorDIController {

    private final GreetingService greetingService;

    public ConstructorDIController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        System.out.println(greetingService.sayHello());
    }
}
