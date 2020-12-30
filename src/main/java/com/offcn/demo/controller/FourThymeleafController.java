package com.offcn.demo.controller;


import com.offcn.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FourThymeleafController {
    @GetMapping("/test4")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";

        model.addAttribute("username","优就业");
        model.addAttribute("href","http://baidu.com");
        model.addAttribute("message",message);
        return "index4";
    }

}
