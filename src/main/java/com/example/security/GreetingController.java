package com.example.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from GreetingController";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String users(){
        return "users endpoint GreetingController";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admins(){
        return "admins endpoint GreetingController";
    }
}
