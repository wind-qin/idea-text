package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticController {

    @RequestMapping("static1")
    public String statictest(){
        System.out.println("静态资源已放行");
        return "index";
    }
}
