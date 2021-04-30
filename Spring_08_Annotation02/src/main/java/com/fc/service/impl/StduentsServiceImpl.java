package com.fc.service.impl;

import com.fc.bean.Students;
import com.fc.dao.DaoStudents;
import com.fc.dao.impl.DaoStudentImpl;
import com.fc.service.StudentsService;

public class StduentsServiceImpl implements StudentsService {
    private DaoStudents daoStudents = new DaoStudentImpl();

    @Override
    public Students getStudents() {
        return daoStudents.getStudents();
    }


    public void setDaoStudent( DaoStudentImpl daoStudent ) {

    }
}
