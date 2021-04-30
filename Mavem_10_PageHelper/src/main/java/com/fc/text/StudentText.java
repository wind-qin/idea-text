package com.fc.text;


import com.fc.Utils.Utils;
import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import java.util.List;

public class StudentText {

    @Test
    public void test(){
        StudentDao mapper = Utils.getMapper(StudentDao.class);

        // 开启分页，必须指定两个参数，必须在sql语句执行前
        // pageNum：当前页
        // pageSize：当前页的数据条数
        PageHelper.startPage(2,2);

        List<Student> list = mapper.findAll();

        // 将查询出来的结果封装到PageInfo中

        PageInfo<Student> pageInfo = new PageInfo<>(list);

        System.out.println("获取当前页：" + pageInfo.getPageNum());
        System.out.println("获取每页显示的条数：" + pageInfo.getPageSize());
        System.out.println("获取总页数：" + pageInfo.getPages());

        List<Student> students = pageInfo.getList();

        for (Student student : students) {
            System.out.println(student);
        }


    }

    @Test
    public void update(){
        StudentDao mapper = Utils.getMapper(StudentDao.class);
        Student student = new Student();

        student.setId(4);
        student.setInfo("小东西");
        int affectRows = mapper.update(student);

        Utils.commit();

        System.out.println(affectRows);


    }


    @Test
    public  void insert(){
        StudentDao mapper = Utils.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("卢老卢");
        student.setAge(20);
        student.setGender("男");
        student.setInfo("高富帅");

        int affectRows = mapper.insert(student);

        Utils.commit();
        System.out.println(affectRows);



    }

    @Test
    public void delete(){
        StudentDao mapper = Utils.getMapper(StudentDao.class);
        int affectRows = mapper.delete(1);
        Utils.commit();
        System.out.println("影响行数"+affectRows);

    }

}
