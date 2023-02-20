package com.azure.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Congrats your app deployed successfully in azure";
	}

	@GetMapping("/employees")
	public String message2() {
		return "meesgae2";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
