package com.spring.dependencyinjection;

import com.spring.dependencyinjection.controllers.ConstructorDIController;
import com.spring.dependencyinjection.controllers.MyController;
import com.spring.dependencyinjection.controllers.PropertyDIController;
import com.spring.dependencyinjection.controllers.SetterDIController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.printHello());

		System.out.println("### Property Dependency Injection ###");
		PropertyDIController propertyDIController = (PropertyDIController) ctx.getBean("propertyDIController");
		System.out.println(propertyDIController.greetings());

		System.out.println("### By Setter Dependency Injection ###");
		SetterDIController setterDIController = (SetterDIController) ctx.getBean("setterDIController");
		setterDIController.sayHello();

		System.out.println("### Constructor Dependency Injection ###");
		ConstructorDIController constructorDIController = (ConstructorDIController) ctx.getBean("constructorDIController");
		constructorDIController.sayHello();

	}

}
