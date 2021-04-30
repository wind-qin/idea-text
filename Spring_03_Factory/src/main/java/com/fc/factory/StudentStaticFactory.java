package com.fc.factory;

import com.fc.bean.Student;

public class StudentStaticFactory {
//静态工厂
    public static Student getStudent(){
        return new Student();
    }
}
