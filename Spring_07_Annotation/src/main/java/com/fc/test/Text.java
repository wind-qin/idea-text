package com.fc.test;

import com.fc.Service.UserService;
import com.fc.Service.impl.UserServiceImpl;
import com.fc.bean.Student;
import com.fc.bean.User;
import com.fc.controller.StudentController;
import com.fc.controller.UserController;
import com.fc.dao.impl.DaoUserImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
    @Test
    public void test(){

//        创建控制层对象用来前后端交互
        UserController userController = new UserController();
//        创建一个业务层对象，用来给控制层注入
        UserServiceImpl userService = new UserServiceImpl();
//        创建一个dao层对象，用来给业务层注入
        DaoUserImpl daoUser = new DaoUserImpl();
//          给业务层注入
        userService.setDaoUser(daoUser);
//        给控制层注入
        userController.setUserSerVice(userService);
//        获取对象
        userController.getUser();
    }

    @Test
    public void GetStudent(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object studentController = context.getBean("studentController", StudentController.class);

//        连接数据库，获取数据库数据
        Student student = ((StudentController) studentController).getStudent();
        System.out.println(student);
    }

}
