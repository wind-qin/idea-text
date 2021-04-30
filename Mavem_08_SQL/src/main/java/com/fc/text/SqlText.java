package com.fc.text;

import Utils.MybatilsUtils;
import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class SqlText {

//    模糊查询
    @Test
    public void text(){
        StudentDao mapper = MybatilsUtils.getMapper(StudentDao.class);
        List<Student> list = mapper.selectLikeStudent("%小%",18);

        for (Student student : list) {
            System.out.println(student);
        }
    }

//    固定id查询
    @Test
    public void textfindById(){
        StudentDao mapper = MybatilsUtils.getMapper(StudentDao.class);
        Student byId = mapper.findById(9);
        System.out.println(byId);
    }

//    添加
    @Test
    public void add(){
        StudentDao mapper = MybatilsUtils.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("卢慧军");
        student.setAge(18);
        student.setGender("男");
        student.setBirthday(new Date());
        student.setInfo("日常敲代码");
        int affectedRows = mapper.add(student);
        MybatilsUtils.commit();
        System.out.println(affectedRows);
    }
//     修改
    @Test
    public void update(){
        StudentDao mapper = MybatilsUtils.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(13);
        student.setName("卢佳琪");
        student.setAge(22);
        student.setInfo("写代码");

        int affectedRows = mapper.update(student);
        MybatilsUtils.commit();
        System.out.println(affectedRows);
    }

//添加前后缀id和name查询 trim
    @Test
    public void trim(){

        StudentDao mapper = MybatilsUtils.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(13);
        student.setName("卢佳琪");
        Student byStudent = mapper.findByStudent(student);
        System.out.println(byStudent);

    }

    @Test
    public void trimUpdate(){
        StudentDao mapper = MybatilsUtils.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(14);
        student.setName("周天赐");
        student.setInfo("打豆豆");
        int affectedRows = mapper.findUpdete(student);
        MybatilsUtils.commit();
        System.out.println(affectedRows);
    }

    @Test
    public void foreach(){
        StudentDao mapper = MybatilsUtils.getMapper(StudentDao.class);
        List<Student> byIds = mapper.findByIds(11, 12);
        for (Student byId : byIds) {
            System.out.println(byId);
        }
    }
}
