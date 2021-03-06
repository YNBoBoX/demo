package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(value = "name") String name) {
        Map<String,Object> user=userService.getUserByName(name);
        return String.format("Hello %s!", user);
    }
}
