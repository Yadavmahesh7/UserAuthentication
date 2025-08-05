package com.example.employeeauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
