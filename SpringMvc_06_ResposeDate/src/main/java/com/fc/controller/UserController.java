package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("users")
    public String User(){
        System.out.println("通过字符串直接跳转页面");
        return "/user.jsp";
    }


    @RequestMapping("testModelandview")
    public ModelAndView modelAndView(){

//        获取一个modelandview
        ModelAndView view = new ModelAndView();
//设置属性键值对
        view.addObject("username","大风车");
        view.addObject("password","刘惜君");
        view.setViewName("/user.jsp");

        return view;
    }

//    返回值void并且返回对象的重定向
    @RequestMapping("response")
    public void response( HttpServletResponse response ){

        System.out.println("重定向");

        try {
            response.sendRedirect("/user.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


//    通过字符串重定向
    @RequestMapping("redirect")
    public String redirect(){
        System.out.println("字符串重定向已执行~~~");
        return "redirect:/user.jsp";
    }

//    使用请求对象转发
    @RequestMapping("request")
    public void resquest( HttpServletResponse response,
                          HttpServletRequest request ){

        System.out.println("转发已执行~~~~");
        try {
            request.getRequestDispatcher("/user.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    使用字符串转发
    @RequestMapping("forward")
    public String forward(){
        System.out.println("字符转发已执行~~~");
        return "forward:/user.jsp";
    }


//    使用ResponseBody注解不被视图解析器处理
    @RequestMapping("body")
    @ResponseBody
    public void body(){
        System.out.println("ResponseBody注解已执行~~~~");
    }


}
