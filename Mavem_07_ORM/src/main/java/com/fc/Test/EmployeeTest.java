package com.fc.Test;

import com.fc.Utils.MybatilsUtils;
import com.fc.bean.Employee;
import com.fc.dao.EmployeeDao;
import org.junit.Test;

import java.util.List;

public class EmployeeTest {
    @Test
    public void test(){
        EmployeeDao mapper = MybatilsUtils.getMapper(EmployeeDao.class);
        List<Employee> byId = mapper.findById(1);
        for (Employee employee : byId) {
            System.out.println(employee);
        }
    }

    @Test
    public void text(){
        EmployeeDao mapper = MybatilsUtils.getMapper(EmployeeDao.class);
        List<Employee> list = mapper.findAll();
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
