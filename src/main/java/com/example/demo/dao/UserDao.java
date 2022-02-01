package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

public interface UserDao {
    @Select("select * from users")
    public List<Map<String,Object>> query();

    @Select("select * from users where id = #{userId}")
    public Map<String,Object> getUser(@Param("userId") Integer userId);

    @Select("select * from users where name = #{name}")
    public Map<String, Object> getUserByName(String name);
}
