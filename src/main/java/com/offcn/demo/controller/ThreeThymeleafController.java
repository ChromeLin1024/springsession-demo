package com.offcn.demo.controller;


import com.offcn.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThreeThymeleafController {
    @GetMapping("/test3")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("张三");
        user1.setAge(22);
        User user2 = new User();
        user2.setId(2);
        user2.setName("李四");
        user2.setAge(22);
        User user3 = new User();
        user3.setId(3);
        user3.setName("wangwu");
        user3.setAge(22);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("message",message);
        model.addAttribute("list",list);
        return "index3";
    }

}
