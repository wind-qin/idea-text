package com.fc.dao.impl;

import com.fc.bean.Students;
import com.fc.dao.DaoStudents;

public class DaoStudentImpl implements DaoStudents {
    @Override
    public Students getStudents() {
        System.out.println("连接数据库");
        return new Students("小白",12);
    }
}
