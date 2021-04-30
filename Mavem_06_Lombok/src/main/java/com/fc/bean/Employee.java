package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    private Integer eId;
    private String eName;
    private Department department;
}
