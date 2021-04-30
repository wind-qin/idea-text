package com.fc.Test;

import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mapper {

//    查询
    @Test
    public void test(){
        try {
            InputStream resource = Resources.getResourceAsStream("Mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resource);
            SqlSession sqlSession = factory.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            List<Student> list = mapper.findByCharacter(1);

            for (Student student : list) {
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
//查询
    @Test
    public void text(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = factory.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            List<Student> byCData = mapper.findByCData(2);
            for (Student byCDatum : byCData) {
                System.out.println(byCData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    添加
    @Test
    public void main(){

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = factory.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            int affectRows = mapper.addStudent();

            System.out.println("受影响行数"+affectRows);

            sqlSession.commit();
            sqlSession.close();
            System.out.println("添加成功");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//     删除
    @Test
    public void text1(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = factory.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            int affectRows = mapper.deleteStudent(3);
            System.out.println("受影响行数"+affectRows);
            sqlSession.commit();
            sqlSession.close();
            if (affectRows!=0){
                System.out.println("删除成功");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//    修改
    @Test
    public void updateStudent(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = factory.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            Student student = new Student();
            student.setId(1);
            student.setName("赵老卢");
            student.setAge(21);
            student.setGender("男");
            student.setInfo("写代码");

            int affectRows = mapper.updateStudent(student);

            System.out.println("受影响行数"+affectRows);

            sqlSession.commit();
            sqlSession.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
