package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@EnableAutoConfiguration // dependencies or JAR required for the embedded server TomCat
@Configuration //allows to register extra beans in the context or import additianal configuration
@ComponentScan(basePackages="com.example.demo") //scan the package where the application is located
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	/*@GetMapping("/welcome")  //url mapping
    public String sayHi()
	{
		return "hello";
	}*/
	@GetMapping("/welcome")
	public GiveResponse sayHi()   //Give response in a json format in the web page
	{
		return new GiveResponse("Hello");
	}
      record GiveResponse(String message){}
}
