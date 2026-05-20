package com.example.arithmeticdemo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class BadRestController {
    private String unusedField = "I am never used";
    private BadService badService = new BadService(); // Should use @Autowired

    @GetMapping("/hello")
    public String policyPremiumCaluculator() {
        int x = 10 % 0; // Arithmetic exception - modulo by zero
        return "Hello, World!";
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") String id) {
        return badService.getUserById(id);
    }
}
