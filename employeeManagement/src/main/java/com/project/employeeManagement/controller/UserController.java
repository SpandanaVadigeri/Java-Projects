package com.project.employeeManagement.controller;

import com.project.employeeManagement.model.authentication.userModel.Users;
import com.project.employeeManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){     // Registering new user
        return service.register(user);
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Users user) {    // checking credentials of previous user
        String token = service.verify(user);

        if ("fail".equals(token)) {
            return Map.of("error", "Invalid username or password");
        }

        return Map.of("token", token);
    }


}
