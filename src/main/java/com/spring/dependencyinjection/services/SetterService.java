package com.spring.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterService implements  GreetingService {

    @Override
    public String sayHello() {
        return "Hello World!! -- Setters";
    }
}
