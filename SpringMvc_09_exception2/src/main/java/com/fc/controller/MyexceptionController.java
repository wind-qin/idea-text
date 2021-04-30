package com.fc.controller;

import com.fc.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class MyexceptionController {

    @RequestMapping("MyException")
    public void MyException(){
        System.out.println("自定义异常已执行");
        throw new MyException("自定义异常");

    }

    @RequestMapping("SystemException")
    public void SystemException(){
        int num = 1/0;
        System.out.println("系统发生异常");

    }


}
