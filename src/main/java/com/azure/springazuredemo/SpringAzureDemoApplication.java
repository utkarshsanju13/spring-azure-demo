package com.azure.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
	

	@GetMapping("/employees")
	public String message2() {
		return "[{\"id\":1,\"name\":\"utkarsh\",\"dept\":\"DEV\",\"salary\":500},{\"id\":2,\"name\":\"abhay\",\"dept\":\"DEV\",\"salary\":50000},{\"id\":3,\"name\":\"sunil\",\"dept\":\"DEV\",\"salary\":8000}]";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
