package com.example.employeeMgt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Employee Management System API!";
    }

    @GetMapping("/status")
    public String status() {
        return "Employee Management System is running successfully!";
    }
}
