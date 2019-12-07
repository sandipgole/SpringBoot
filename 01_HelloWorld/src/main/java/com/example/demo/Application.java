package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contex=SpringApplication.run(Application.class, args);
		
		System.out.println("HelloWorld");
		gole g=contex.getBean(gole.class);
		g.show();
	}

}
