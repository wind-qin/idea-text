package com.fc.dao;

import com.fc.bean.Student;

public interface StudentDao {

    /*学生接口，提供了对学生表的增删改查的方法*/
//    插入一条数据到数据库
    int addStudent();
//根据指定id查询对应的学生
    Student findStudentById(int id);


}
