package com.fc.dao.impl;

import com.fc.bean.Student;
import com.fc.dao.DaoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoStudentImpl implements DaoStudent {

    @Autowired
    private Student student;
    @Override
    public Student getStudent() {

        System.out.println("连接数据库");
        return student;
    }
}
