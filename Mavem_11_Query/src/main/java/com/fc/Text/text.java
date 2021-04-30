package com.fc.Text;

import com.fc.Utils.Utils;
import com.fc.bean.Department;
import com.fc.bean.Employee;
import com.fc.dao.DepaetmentDao;
import com.fc.dao.EmployeeDao;
import org.junit.Test;

import java.util.List;

public class text {

    @Test
    public void department() {
        DepaetmentDao mapper = Utils.getMapper(DepaetmentDao.class);
        Department byId = mapper.findById(1);
        System.out.println(byId);

    }


    @Test
    public void Employeetext() {
        EmployeeDao mapper = Utils.getMapper(EmployeeDao.class);
        List<Employee> list = mapper.findByDepartMentId(1);
        for (Employee employee : list) {
            System.out.println(employee);
        }


    }
}
