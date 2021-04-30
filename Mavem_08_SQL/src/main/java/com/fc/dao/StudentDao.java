package com.fc.dao;

import com.fc.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
//    通过名字和年龄模糊查询
    List<Student> selectLikeStudent( @Param ("name")String name, @Param("age")Integer age);
//根据id查找学生
    Student findById(@Param("id") Integer id);

//    添加
    int add(Student student);
//    修改
    int update(Student student);
//去除前后缀查询
    Student findByStudent(Student student);

//    通过指定添加前后缀进行使用修改sql
    int findUpdete(Student student);

//    foreach使用
    // 根据指定的id查询对应的学生
    // ... ：可变长参数（不定长参数）jdk1.5 的新特性，相当于数组
    // k可变长参数的长度可变，可以是0个，1个，多个
    // 可变长参数在形参中只能有一个，并且只能是最后一个
    List<Student> findByIds(Integer... ids);

}
