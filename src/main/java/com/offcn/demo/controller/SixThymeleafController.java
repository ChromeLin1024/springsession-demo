package com.offcn.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SixThymeleafController {
    @GetMapping("/test6")
    public String indexPage(Model model) {
        return "index6";
    }

}
