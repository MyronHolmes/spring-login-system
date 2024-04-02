package com.myprojects.loginsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Hello, Home!";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello, Secured!";
    }
}
