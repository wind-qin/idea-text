package com.fc.test;

import com.fc.Utils.Utils;
import com.fc.bean.Department;
import com.fc.dao.DepartmentMapper;
import org.junit.Test;

public class text {
    @Test
    public void text(){
        DepartmentMapper mapper = Utils.getMapper(DepartmentMapper.class);
        Department department = mapper.selectByPrimaryKey(1);
        System.out.println(department);
    }
}
