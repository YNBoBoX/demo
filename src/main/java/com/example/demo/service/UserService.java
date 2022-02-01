package com.example.demo.service;

import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserService {
    @Autowired
    UserDao userDao;

    public void query(){
        System.out.println(userDao.query());
    }

    public void getUser(Integer userId){
        System.out.println(userDao.getUser(userId));
    }

    public Map<String, Object> getUserByName(String name) {
        return userDao.getUserByName(name);
    }
}
