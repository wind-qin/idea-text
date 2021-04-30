package com.fc.test;

import com.fc.bean.users;
import com.fc.config.JdbcTementplate;
import com.fc.dao.impl.JdbcTemplateDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class jdbctest {

    @Test
    public void  jdbctest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateDaoImpl templateDao = (JdbcTemplateDaoImpl) context.getBean("jdbcTemplateDao",JdbcTemplateDaoImpl.class);
        templateDao.add("赵老卢","22");
        templateDao.add("周老卢","19");
        templateDao.add("秦老卢","20");
    }

    @Test
    public void select(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateDaoImpl templateDao = context.getBean("jdbcTemplateDao", JdbcTemplateDaoImpl.class);
        templateDao.select(1);
    }

    @Test
    public void delete(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateDaoImpl templateDao = context.getBean("jdbcTemplateDao", JdbcTemplateDaoImpl.class);
        templateDao.delete(1);
    }

    @Test
    public void selectId(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateDaoImpl templateDao = context.getBean("jdbcTemplateDao", JdbcTemplateDaoImpl.class);
        List<users> list = templateDao.selectId();
        for (users users : list) {
            System.out.println(users);
        }
    }

    @Test
    public void jdbcTemplate(){
//        获取spring容器
        AnnotationConfigApplicationContext jdbcTementplate = new AnnotationConfigApplicationContext(JdbcTementplate.class);
        JdbcTementplate jdbcTementplate1 = jdbcTementplate.getBean("jdbcTementplate", JdbcTementplate.class);
        users users = jdbcTementplate.getBean("users", users.class);

        System.out.println(jdbcTementplate);
        System.out.println(users);


    }
}
