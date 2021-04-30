package com.fc.controller;

import com.fc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @RequestMapping("userFormat")
    public String usertest( User user, HttpSession session ){
        session.setAttribute("username",user);
        System.out.println(user);
        return "/index.jsp";

    }
}
