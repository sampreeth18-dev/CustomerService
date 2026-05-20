package com.example.arithmeticdemo;

public class BadService {
    public String getUserById(String id) {
        if (id == null) {
            // No exception handling
            return null;
        }
        if (id.equals("1")) {
            return "Admin";
        }
        return "User" + id; // Hardcoded logic
    }
}
