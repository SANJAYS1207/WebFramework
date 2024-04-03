package com.project.project1.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {

    @GetMapping("/welcome")

    public String message() {
        return "Hello This is Sanjay";
    }
}
