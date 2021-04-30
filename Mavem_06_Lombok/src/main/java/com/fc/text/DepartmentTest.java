package com.fc.text;

import com.fc.Utils.Utils;
import com.fc.bean.Department;
import com.fc.dao.DeptDao;
import org.junit.Test;

public class DepartmentTest {

    @Test
    public void text(){
        DeptDao mapper = Utils.getMapper(DeptDao.class);
        Department byDepartmentId = mapper.findByDepartmentId(1);
        System.out.println(byDepartmentId);
    }
}
