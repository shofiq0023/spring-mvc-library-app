package com.shofiqul.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/books";
    }

    @GetMapping("/books")
    public String getHomePage() {
        return "books";
    }
    
    @GetMapping("/list")
    public String getListPage() {
    	return "list";
    }
}
