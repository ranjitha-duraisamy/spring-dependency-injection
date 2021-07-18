package com.spring.dependencyinjection;

import com.spring.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.printHello());
	}

}
