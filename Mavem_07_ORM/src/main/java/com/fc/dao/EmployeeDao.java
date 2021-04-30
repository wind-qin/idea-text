package com.fc.dao;

import com.fc.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
//    根据id查询对应的员工
    List<Employee> findById( @Param ("id") Integer id);
//      查询所有的员工
    List<Employee> findAll();
}
