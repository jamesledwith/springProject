package com.SpringBootFirstPro.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  
				SpringApplication.run(SpringbootApplication.class, args);
		
		//gets all names of beans in the application context
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		
	}

}
