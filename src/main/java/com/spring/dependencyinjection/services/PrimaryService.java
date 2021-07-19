package com.spring.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PrimaryService implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello From Primary Service";
    }
}
