package com.isageek.blaztek.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

	@GetMapping("/greeting")
	public String greeting() {
		return "Hello from Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
