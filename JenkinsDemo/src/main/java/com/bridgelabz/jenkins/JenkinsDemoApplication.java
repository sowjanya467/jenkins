package com.bridgelabz.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
	@GetMapping("/")
	public String sample()
	{
		return "Sample method";
		
	}
}
