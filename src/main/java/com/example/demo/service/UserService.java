package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserEntity queryUser(Integer id){
        return userMapper.selectUserById(id);
    }
}
