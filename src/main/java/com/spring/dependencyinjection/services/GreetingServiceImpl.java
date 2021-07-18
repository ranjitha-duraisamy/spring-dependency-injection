package com.spring.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello World!!";
    }
}
