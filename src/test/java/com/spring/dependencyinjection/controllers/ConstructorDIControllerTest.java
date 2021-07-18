package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorDIControllerTest {

    private ConstructorDIController constructorDIController;

    @BeforeEach
    void setUp() {
        constructorDIController  = new ConstructorDIController( new GreetingServiceImpl() );
    }

    @Test
    void sayHello() {
        constructorDIController.sayHello();
    }

}