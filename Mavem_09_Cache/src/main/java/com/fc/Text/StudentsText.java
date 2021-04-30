package com.fc.Text;

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

public class StudentsText {
    @Test
    public void test(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            List<Student> list = mapper.findAll();

//            sqlSession.commit();

//            sqlSession.rollback();
            List<Student> list1 = mapper.findAll();

            System.out.println(list);
            System.out.println(list1);

            System.out.println(list==list1);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void twotext(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            StudentDao mapper1 = sqlSession.getMapper(StudentDao.class);
            StudentDao mapper2 = sqlSession.getMapper(StudentDao.class);

            List<Student> all = mapper.findAll();
            sqlSession.commit();
            System.out.println("第二次");
            List<Student> all1 = mapper1.findAll();
//            二级缓存作用于工厂


            System.out.println("第三次");
            List<Student> all2 = mapper2.findAll();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
