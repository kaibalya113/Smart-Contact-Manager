package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("com.example.model")
@ComponentScan(basePackages={"com.example.controller"})
@SpringBootApplication
public class SmartContactManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartContactManagerApplication.class, args);
	}
}