package com.fc.controller;

import com.fc.bean.User;
import com.fc.service.UserService;
import com.fc.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserController extends HttpServlet {
    private  UserService userService = new UserServiceImpl();



    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
//            从前端获取对象
        req.getParameter("");
//      从业务层获取对象
        User user = userService.getUser();

//        储存属性
        HttpSession session = req.getSession();

//        转发
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        doPost(req, resp);
    }
}
