package com.concept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.concept")
public class JavaConceptApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavaConceptApplication.class, args);
	}
}
