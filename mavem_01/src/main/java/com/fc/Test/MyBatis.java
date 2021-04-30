package com.fc.Test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class MyBatis {

    @Test
    public void test() {
//        1、读取配置文件
//        2、获取SqlSession工厂
//        3、获取SqlSession对象
//        4、通过SqlSession获取接口的代理对象
//        5、通过代理对象调用方法操作数据库
//        6、关闭资源【重点】
        SqlSession sqlSession = null;
        try {
//            读取配置文件
            InputStream resource = Resources.getResourceAsStream("Mybatis.xml");
//            获取SqlSession工厂
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resource);
//            获取SqlSession对象
             sqlSession = factory.openSession();


            System.out.println(sqlSession);
//          执行sql语句
            int affectedRows = sqlSession.insert("Mapper.add");
//            提交事务
            sqlSession.commit();
            System.out.println("受影响行数"+affectedRows);



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
