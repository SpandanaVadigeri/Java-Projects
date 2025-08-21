package com.example.employeeMgt; // Defines the package name where this class belongs.

import org.springframework.boot.SpringApplication; //Imports Spring Boot's SpringApplication class, used to launch the application.
import org.springframework.boot.autoconfigure.SpringBootApplication;// Imports the @SpringBootApplication annotation, which enables-Component scanning,Auto-configuration,Configuration declaration

@SpringBootApplication // This annotation marks this class as the main configuration class for the Spring Boot app.
public class EmployeeMgtApplication { // Defines the main class of the application.

	public static void main(String[] args) { // The main method — the entry point of any Java application.
		SpringApplication.run(EmployeeMgtApplication.class, args);   // Starts the Spring Boot application.
	}
}
