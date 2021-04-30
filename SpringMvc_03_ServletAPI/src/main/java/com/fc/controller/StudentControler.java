package com.fc.controller;

import com.fc.bean.Complextype;
import com.fc.bean.Student;
import com.fc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class StudentControler {


    @RequestMapping("testSpring")
    public String testSpring( String username,
                              String password,
                              int age,
                              String gender,
                              String info,
                              HttpSession session ) {
//从前端获取参数
        System.out.println("从前端获取参数" + username + "" + password + "" + age + "" + gender + "" + info);

        session.setAttribute("username", username);
        session.setAttribute("info", info);

        return "/index.jsp";
    }


    @RequestMapping("api")
    public String api( String name, HttpSession session ) {
        System.out.println(name);
        // 通过请求对象获取前端页面中input标签中name属性对应的value
        session.setAttribute("name", name);
        return "/index.jsp";
    }

    @RequestMapping("user")
    public String user(User user,String birthday,HttpSession session) {
        System.out.println("从前端获取的日期格式参数为" + birthday);
        System.out.println(user);
        String replace = birthday.replace("-", "/");
        System.out.println("转换后的日期格式为" + replace);
        session.setAttribute("username",user.getUsername());
        return "/index.jsp";
    }

    @RequestMapping("student")
    public String Student( Student student,HttpSession session){
        session.setAttribute("username",student.getUsername());
        System.out.println(student);
        return "/index.jsp";
    }

    @RequestMapping("complexty")
    public String complextyTest( Complextype complextype,HttpSession session ){
        session.setAttribute("username",complextype.getList());
        System.out.println(complextype);
        return "/index.jsp";
    }


    @RequestMapping("apitest")
    public void api(User user, HttpServletRequest request,
                     HttpServletResponse response,
                     HttpSession session){

        // 通过请求对象获取前端页面中input标签中name属性对应的value
        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        Integer age = Integer.valueOf(request.getParameter("age"));
//        String gender = request.getParameter("gender");
//        String info = request.getParameter("info");

        // 给域对象中添加属性键值对
        request.setAttribute("username",username);
        session.setAttribute("user",user);
//打印前端获取值
        System.out.println(user);

//            转发
        try {
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }




}
