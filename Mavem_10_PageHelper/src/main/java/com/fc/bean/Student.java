package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Date birthday;
    private String info;
}
