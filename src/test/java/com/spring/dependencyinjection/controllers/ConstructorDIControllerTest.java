package com.spring.dependencyinjection.controllers;

import com.spring.dependencyinjection.services.PropertyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorDIControllerTest {

    private ConstructorDIController constructorDIController;

    @BeforeEach
    void setUp() {
        constructorDIController  = new ConstructorDIController( new PropertyService() );
    }

    @Test
    void sayHello() {
        constructorDIController.sayHello();
    }

}