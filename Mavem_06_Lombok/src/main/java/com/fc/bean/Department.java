package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//部门表
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Integer dId;
    private String dName;
//    一个部门有多个员工
    private List<Employee> employees;
}
