package com.fc.Dao;

import com.fc.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    //插入一条数据到数据库
//    添加
    int addStudent();

    // 根据指定id查询对应的学生
    Student findStudentById( int id);

    List<Student> findByCharacter( int id);

    //    测试原样输出
    List<Student> findByCData( int id);
    //    删除
    int deleteStudent ( @Param("id") Integer id);
    //    修改
    int updateStudent (Student student);

    List<Student> finadd();

}
