package com.example.arithmeticdemo;

import java.util.*;

public class BadRepository {
    private List<String> users = Arrays.asList("Admin", "User1", "User2");
    public String findUser(String id) {
        // Inefficient search, no error handling
        for (String user : users) {
            if (user.endsWith(id)) {
                return user;
            }
        }
        return null;
    }
}
