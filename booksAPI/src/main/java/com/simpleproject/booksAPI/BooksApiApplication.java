package com.simpleproject.booksAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation marks this class as the entry point for Spring boot application
@SpringBootApplication
public class BooksApiApplication {

    //The main method to launch the application
	public static void main(String[] args) {
		SpringApplication.run(BooksApiApplication.class, args);
	}

}

