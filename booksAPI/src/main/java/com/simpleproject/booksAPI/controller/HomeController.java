package com.simpleproject.booksAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This class handles web requests to the root("/")
@RestController
public class HomeController {

    //Map GET request to "/" URL nad return a welcome message
    @RequestMapping("/")
    public String greet(){
        return "Welcome to the world of books!!";
    }

}
