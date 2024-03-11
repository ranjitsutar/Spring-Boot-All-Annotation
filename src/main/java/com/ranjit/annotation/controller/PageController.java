package com.ranjit.annotation.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/home")
public class PageController {

    @RequestMapping("/page1")
//    @ResponseBody
    public List<String> home(){
        System.out.println("Home page");
        return Arrays.asList("ranjit","chandan", "bara");
    }
}
