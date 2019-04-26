package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloPostController {

    @RequestMapping(value = "/hello-post", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost() {
        return "HelloPost World!";
    }
}
