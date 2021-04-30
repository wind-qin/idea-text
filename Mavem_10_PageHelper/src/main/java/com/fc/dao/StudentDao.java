package com.fc.dao;

import com.fc.bean.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentDao {

// 查询   注解 + ""双引号
@Select("select * from student")
    List<Student> findAll();

//修改
    @Update("update student set info=#{info} where id=#{id}")
    int update(Student student);

//    添加
    @Insert("insert into student(name,age,gender,info) values(#{name},#{age},#{gender},#{info})")
    int insert(Student student);

//    删除
    @Delete("delete from student where id= #{id}")
    int delete( int id);



}
