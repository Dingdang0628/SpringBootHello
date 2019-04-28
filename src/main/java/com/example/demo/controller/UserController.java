package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Autowired
    private UserService userService;

    @RequestMapping(value = "query")
    public UserEntity queryUser(@RequestParam Integer id) {
        UserEntity userEntity = userService.queryUser(id);
        try {
            LOGGER.info(OBJECT_MAPPER.writeValueAsString(userEntity));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return userEntity;
    }
}
