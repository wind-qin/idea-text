package com.fc.text;

import com.fc.bean.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

//        ApplicationContext中没有close方法
        context.close();
        System.out.println(student);
    }
}
