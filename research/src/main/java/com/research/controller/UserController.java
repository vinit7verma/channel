package com.research.controller;

import com.research.service.UserRateLimiter;
import com.research.service.UserRateLimiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRateLimiter userRateLimiter;

    @Autowired
    UserRateLimiterService userRateLimiterService;

    @GetMapping("/users/hello")
    public String getUserHello(@RequestHeader("X-User-ID") String userId) {
        System.out.println("hello from server 1 from user - " + userId);
        //return userRateLimiter.getUserHello();
        return userRateLimiterService.processRequest(userId, () -> {
            // Actual logic for the request
            return "Hello, user " + userId;
        });
    }
}
