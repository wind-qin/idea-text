package com.fc.factory;

import com.fc.bean.Student;

public class StudentFactory {
//   工厂
    public Student getStudent(){

        return new Student();
    }
}
