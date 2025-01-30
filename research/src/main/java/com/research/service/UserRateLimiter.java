package com.research.service;

import org.springframework.stereotype.Service;

@Service
public class UserRateLimiter {

    //@RateLimiter(name = "userHello")
    public String getUserHello() {
        return "hello from server 1";
    }
}
