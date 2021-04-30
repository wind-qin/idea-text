package com.fc.dao;

import com.fc.bean.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeDao {
//       查询指定id对应的员工的部门名称
       Employee findById( @Param ("id") int id);

}


