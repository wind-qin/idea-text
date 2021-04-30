package com.fc.dao;

import com.fc.bean.Department;
import org.apache.ibatis.annotations.Param;

public interface DepaetmentDao {
    // 根据部门id获取部门的信息（包含员工）
    Department findById(@Param ("id") Integer id);

}
