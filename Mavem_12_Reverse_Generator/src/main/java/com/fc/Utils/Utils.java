package com.fc.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Utils {


    // 声明一个工厂对象
    private static SqlSessionFactory factory;

    // 通过ThreadLocal存储SqlSession，为了保证线程安全
    private static final ThreadLocal<SqlSession> THREAD_LOCAL = new ThreadLocal<>();

    // 通过静态代码块加载配置文件并获取工厂对象（只需要加载一次）
    static {
        try {

            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");

            factory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 获取sqlSession
    private static SqlSession openSession() {
        // 首先通过ThreadLocal获取sqlSession
        SqlSession sqlSession = THREAD_LOCAL.get();

        // 如果没有拿到
        if (sqlSession == null) {
            // 通过工厂获取sqlSession
            sqlSession = factory.openSession();

            // 将获取到的sqlSession放到ThreadLocal中
            THREAD_LOCAL.set(sqlSession);
        }

        return sqlSession;
    }

    // 获取接口的实现类对象
    public static <T> T getMapper(Class<T> clazz) {
        // 获取sqlSession
        SqlSession sqlSession = openSession();

        // 获取接口的实现类对象
        return sqlSession.getMapper(clazz);
    }

    // 释放sqlSession
    private static void close() {
        // 从ThreadLocal中获取sqlSession
        SqlSession sqlSession = THREAD_LOCAL.get();

        // 关闭
        sqlSession.close();

        // 要把ThreadLocal中的sqlSession移除掉
        THREAD_LOCAL.remove();
    }

    // 提交事务
    public static void commit() {
        // 获取sqlSession
        SqlSession sqlSession = openSession();

        // 提交
        sqlSession.commit();

        // 关闭
        close();
    }

    // 回滚
    public static void rollback() {
        // 获取sqlSession
        SqlSession sqlSession = openSession();

        // 回滚
        sqlSession.rollback();

        // 关闭
        close();
    }
}
