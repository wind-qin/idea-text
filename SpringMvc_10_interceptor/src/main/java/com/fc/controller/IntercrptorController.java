package com.fc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class IntercrptorController {
    @RequestMapping("user")
    public void test(){
        System.out.println("要拦截的路径");
    }
}
