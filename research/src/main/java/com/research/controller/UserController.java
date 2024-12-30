package com.research.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users/hello")
    public String getUserHello() {
        System.out.println("hello from server 1");
        return "hello from server 1";
    }
}
