package com.fc.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.fc.bean.users;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.Properties;

//Configuration要和@bean配合使用
@Configuration
//引入外部资源文件
@PropertySource("classpath:jdbc.properties")
//扫描com.fc下的注解
@ComponentScan("com.fc")

public class JdbcTementplate {

    @Value("${jdbc.driver}")
    private String driveClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    public JdbcTementplate() {

    }

    public JdbcTementplate( DataSource dataSource ) {

    }

    @Bean("jdbcTementplate")
    public JdbcTementplate gettement(){

        // 创建一个Properties对象并赋值
        Properties properties = new Properties();
        properties.setProperty("driveClassName",driveClassName);
        properties.setProperty("url",url);
        properties.setProperty("username",username);
        properties.setProperty("password",password);

        DataSource dataSource = null;
        try {
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  new JdbcTementplate(dataSource);
    }

    public users getUser(){
        return new users(1,"卢老卢","二货，来条士力架");
    }


}
