package com.fc.text;

import com.fc.Utils.Utils;
import com.fc.bean.Employee;
import com.fc.dao.EmployeeDao;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testFindById(){

        EmployeeDao mapper = Utils.getMapper(EmployeeDao.class);
        Employee byId = mapper.findById(1);
        System.out.println(byId);

    }
}
