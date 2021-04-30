package com.fc.com.fc.text;

import com.fc.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
    @Test
    public void text(){
//        通过工厂中的工厂方法获取对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("studentByFactory");
        System.out.println(student);


    }

    @Test
    public void StaticText(){
//        获取静态工厂对象
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) classPathXmlApplicationContext.getBean("studentByStaticFactory");

        System.out.println(student);
    }
}
