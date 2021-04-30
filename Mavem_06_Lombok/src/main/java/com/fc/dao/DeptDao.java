package com.fc.dao;

import com.fc.bean.Department;
import org.apache.ibatis.annotations.Param;

public interface DeptDao {

//    查询所用员工的id

   Department findByDepartmentId( @Param ("id") int id);

}
