package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping(value = "delect",method = RequestMethod.POST,params = "id")
    public String loginStudent(int id){

        System.out.println("删除方法执行~~~~~~"+id);

        return "/index.jsp";
    }

@RequestMapping("add")
    public String add(){
    System.out.println("添加方法执行中");
        return "/index.jsp";
    }
}
