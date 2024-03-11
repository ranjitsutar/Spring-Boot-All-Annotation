package com.ranjit.annotation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControlle {

//    @RequestMapping("/get")
    @GetMapping("/get")
    public String getUser(){
        return "get";
    }
    @PostMapping("/post")
    public String postUser(){
        return "Post";
    }
}
