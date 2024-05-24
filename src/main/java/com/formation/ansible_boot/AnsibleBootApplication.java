package com.formation.ansible_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnsibleBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnsibleBootApplication.class, args);
		
		
	}
	
	@GetMapping(value = "hello")
	public String hello() {
		return "<h2> Bonjour spring v2  </h2>" ;
	}

	
	
}
