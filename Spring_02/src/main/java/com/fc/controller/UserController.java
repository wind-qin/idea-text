package com.fc.controller;

import com.fc.bean.User;
import com.fc.service.UserService;
import com.fc.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController extends HttpServlet {
    private UserService userService = new UserServiceImpl();


    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {

//        从前端获取请求对象
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
//         通过业务层获取对象
        User user = userService.getUser();
//        将属性值储存到域对象
        req.getSession().setAttribute("User",user);
//      通过转发到前端
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
