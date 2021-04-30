package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer dId;
    private String dName;
    //一个部门有多少个员工
    private List<Employee> employees;
}
