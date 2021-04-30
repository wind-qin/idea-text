package com.fc.test;

import com.fc.bean.Car;
import com.fc.bean.Students;
import com.fc.controller.CarController;
import com.fc.controller.StudentsController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    @Test
    public void test(){
//        获取ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//从ioc容器中获取对象
        CarController student = context.getBean("carController", CarController.class);
//执行方法
        Car car = student.getCar();
        System.out.println(car);
    }

    @Test
    public void StudentsTest(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object controller = classPathXmlApplicationContext.getBean("studentsController", StudentsController.class);
        Students students = ((StudentsController) controller).getstudents();
        System.out.println(students);

    }


}
