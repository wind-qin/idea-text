package com.fc.controller;

import com.fc.controller.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class UserController {
    @RequestMapping("throw")
    public void testMyException(){
            throw new MyException("异常处理");
    }
}
