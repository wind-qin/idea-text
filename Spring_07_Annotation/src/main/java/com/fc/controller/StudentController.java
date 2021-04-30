package com.fc.controller;

import com.alibaba.druid.filter.AutoLoad;
import com.fc.Service.StudentService;
import com.fc.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// 通过Spring容器创建兑现
@Controller
public class StudentController {
//依赖注入
    @Autowired
    private StudentService studentService;

    public Student getStudent(){

        return studentService.getStudent();
    }


}
