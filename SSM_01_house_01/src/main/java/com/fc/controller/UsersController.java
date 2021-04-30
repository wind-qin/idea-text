package com.fc.controller;

import com.fc.bean.User;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(HttpSession session,HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String type = request.getParameter("type");
        User user = userService.findByName(username,password,type);
        if (type.equals("admin")){
            if (user!=null){
                if (username.equals(user.getUsername())&&password.equals(user.getPassword())){
                    session.setAttribute("user",user);
                    return "/login";
                }
            }
        }
        return "error";
    }



}
