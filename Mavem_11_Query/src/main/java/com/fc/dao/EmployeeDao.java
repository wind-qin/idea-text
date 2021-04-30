package com.fc.dao;

import com.fc.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

//    根据部门id获取指定部门下的所有员工
    List<Employee> findByDepartMentId( @Param ("id") Integer id);

}
