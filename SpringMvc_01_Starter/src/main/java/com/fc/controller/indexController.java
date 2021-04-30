package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {


    @RequestMapping("login")
    public String login(){
        System.out.println("访问成功！！！");
        return "/index.jsp";
    }

    @RequestMapping("index")
    public String index(String name ,int age){
        System.out.println(name+ age+"二次访问!!!");
        return "/test.jsp";
    }
}
