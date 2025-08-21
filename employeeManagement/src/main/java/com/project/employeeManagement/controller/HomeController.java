package com.project.employeeManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class HomeController {
        @GetMapping("/")
        public Map<String,String> home(){
           return Map.of(
                    "project", "Employee Management System",
                    "version", "1.0",
                    "status", "running"
            );
        }

}



