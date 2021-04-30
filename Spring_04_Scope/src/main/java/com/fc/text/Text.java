package com.fc.text;

import com.fc.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
    @Test
    public void singletonTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

//单例，只创建一个对象
        Student student1 = (Student) context.getBean("student");
        System.out.println(student==student1);
    }

    @Test
    public void prototypeTest(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("studentTwo");

//多例，创建多个对象
        Student student1 = (Student) context.getBean("studentTwo");
        System.out.println(student==student1);
    }

}
