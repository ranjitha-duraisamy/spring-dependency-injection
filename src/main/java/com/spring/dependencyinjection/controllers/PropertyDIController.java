package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingService;

public class PropertyDIController {

    public GreetingService greetingService;

    public String greetings() {
        return greetingService.sayHello();
    }
}
