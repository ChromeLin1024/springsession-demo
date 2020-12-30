package com.offcn.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FiveThymeleafController {
    @GetMapping("/test5")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        model.addAttribute("message",message);
        return "index5";
    }

}
