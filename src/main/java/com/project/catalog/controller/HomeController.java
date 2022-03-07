package com.project.catalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("message", "Hello World from SpringMVC + Thymeleaf");
        return "home";
    }
}
