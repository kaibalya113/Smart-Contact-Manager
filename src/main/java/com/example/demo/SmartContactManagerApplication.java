package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.example.model")
@ComponentScan(basePackages={"com.example.controller", "com.example.config"})
@EnableJpaRepositories("com.example.dao")
@SpringBootApplication
public class SmartContactManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartContactManagerApplication.class, args);
	}
}