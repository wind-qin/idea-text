package com.fc.controller;

import com.fc.bean.Students;
import com.fc.service.StudentsService;
import com.fc.service.impl.StduentsServiceImpl;

public class StudentsController {
    private StudentsService studentService = new StduentsServiceImpl();

    public Students getstudents(){
        return studentService.getStudents();
    }

    public void setStduentsService( StduentsServiceImpl stduentsService ) {

    }
}
