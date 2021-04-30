package com.fc.Service.impl;

import com.fc.Service.StudentService;
import com.fc.bean.Student;
import com.fc.dao.DaoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
//注解注入
    @Autowired
//    @Qualifier("student") ""中的名字相当于dao文件所在名
    private DaoStudent daoStudent;


    @Override
    public Student getStudent() {
        return daoStudent.getStudent();
    }
}
