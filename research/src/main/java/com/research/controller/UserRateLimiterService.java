package com.research.controller;

import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterRegistry;
import io.github.resilience4j.ratelimiter.RequestNotPermitted;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class UserRateLimiterService {

    private final RateLimiterRegistry rateLimiterRegistry;

    public UserRateLimiterService(RateLimiterRegistry rateLimiterRegistry) {
        this.rateLimiterRegistry = rateLimiterRegistry;
    }

    public String processRequest(String userId, Supplier<String> request) {
        RateLimiter rateLimiter = rateLimiterRegistry.rateLimiter(userId);
        try {
            // Decorate and execute the supplier
            return RateLimiter.decorateSupplier(rateLimiter, request).get();
        } catch (RequestNotPermitted e) {
            return "Rate limit exceeded for user: " + userId;
        }
    }
}

