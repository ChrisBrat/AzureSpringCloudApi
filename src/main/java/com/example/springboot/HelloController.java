package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import com.github.javafaker.Faker;

@RestController
public class HelloController {

	@Value("${helloworld.message:HelloWorldNotSet}")
	private String helloWorld;

	@Value("${mypassword}")
	private String password;

	private Faker faker = new Faker();

	@GetMapping("/")
	public String index() {

		
        return faker.yoda().quote();
	}

}
