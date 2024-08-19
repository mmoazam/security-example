package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from GreetingController";
    }

    @GetMapping("/user")
    public String users(){
        return "users endpoint GreetingController";
    }

    @GetMapping("/admin")
    public String admins(){
        return "admins endpoint GreetingController";
    }
}
