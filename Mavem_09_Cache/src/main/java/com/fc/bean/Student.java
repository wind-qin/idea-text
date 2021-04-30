package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable{

//  static  transient 瞬时的 有这两个关键字不能被序列化
    private static final long serialversionUID = 1L;
    private  Integer id;
    private transient String name;
    private static Integer age;
    private Date birthday;
    private  String info;




}
