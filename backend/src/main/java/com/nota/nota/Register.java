package com.nota.nota;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Register {
    @GetMapping("/register")
    public String register() {
        return "Hello from Spring Boot!";
    }
}
