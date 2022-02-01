package com.example.demo;

import com.example.demo.app.Appconfig;
import com.example.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMapper {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
        ac.getBean(UserService.class).getUser(1);
    }
}
