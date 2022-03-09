package com.capg.lj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class LearningJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningJavaApplication.class, args);
	}

}
