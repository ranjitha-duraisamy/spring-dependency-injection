package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingService;

public class SetterDIController {

    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void sayHello() {
        System.out.println(getGreetingService().sayHello());
    }
}
