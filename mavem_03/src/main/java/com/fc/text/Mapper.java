package com.fc.text;

import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Mapper {
    @Test
    public void text(){


        try {
            // 1、加载核心配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
            // 2、获取工厂对象
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            // 3、获取会话
            SqlSession sqlSession = factory.openSession();
            // 4、获取接口的实现类对象（代理对象）
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            // 5、执行sql语句
            int affectedRows = mapper.addStudent();
            System.out.println("受影响的行数"+affectedRows);
            // 6、提交事务
            sqlSession.commit();
            // 7、关闭资源
            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testFindOne(){
        /*
         1、加载核心配置文件
         2、获取工厂对象
         3、获取会话
         4、获取接口实现类
         5、执行方法-->sql语句
         6、瞅一眼
        * */
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = factory.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            Student student = mapper.findStudentById(1);

            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
