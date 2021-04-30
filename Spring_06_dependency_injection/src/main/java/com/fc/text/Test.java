package com.fc.text;

import com.fc.bean.Student;
import com.fc.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    @org.junit.Test
    public void  test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student);

    }


    @org.junit.Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object house = context.getBean("house");
        User user = (User) context.getBean("user");

        System.out.println(house);
        System.out.println(user);



    }

    @org.junit.Test
    public void complexTypeText(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object complexType = context.getBean("complexType");
        System.out.println(complexType);
    }

    @org.junit.Test
    public void MapTest(){
//        泛型推断
        HashMap<Object, Object> map = new HashMap<>();
        map.put("1","我IU");
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }


    }

}
