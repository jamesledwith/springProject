package com.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World! whats up?";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean ("Hello World! whats up?");
	}
	
	
}
