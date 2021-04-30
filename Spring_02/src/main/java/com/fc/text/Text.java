package com.fc.text;

import com.fc.dao.UserDao;
import com.fc.dao.impl.UserDaoImplMysql;
import com.fc.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
    @Test
    public void text(){
//        固定格式
//        获取Spring容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过容器获取对应的bean对象
        UserDao userDao = (UserDao) context.getBean("user");
//        执行对应的方法
        userDao.getUser();

    }

    @Test
    public void textFrelect(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImplMysql());
        userService.getUser();
    }


    @Test
    public void textbean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object student = context.getBean("student");
        System.out.println(student);

    }
}
