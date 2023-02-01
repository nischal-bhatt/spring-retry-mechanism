package com.example.demoporject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class DemoPorject22Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoPorject22Application.class, args);
	}

}
