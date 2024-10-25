package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private List<String> users = new ArrayList<>();
    @GetMapping("/")
    public String home() {
        return "This is Homepage";
    }
}
