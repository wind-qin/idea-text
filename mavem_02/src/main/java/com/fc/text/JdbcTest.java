package com.fc.text;

import com.fc.bean.Student;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class JdbcTest {


    //测试通过jdbc插入数据到数据库中
    @Test
    public void testAdd(){
        try {
//           1. 加载驱动
            Class.forName("com.mysql.jdbc.Driver");

//          2.  准备参数
            String url="jdbc:mysql://localhost:3306/dev01?useSSl=false";
            String user="root";
            String password="root";

//            获取数据库连接
            Connection connection = getConnection(url, user, password);
//            出现一个地址表示连接成功！
            System.out.println(connection);
//            准备SQL语句
            String sql = "insert into student(name,age,info) values(?,?,?)";

//            sql注入
//            4.获取预处理搬运工，用来将SQL语句搬运带数据库中
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

//            5.设置参数
            preparedStatement.setString(1,"小红");
            preparedStatement.setInt(2,21);
            preparedStatement.setString(3,"努力向上");

            int affectedRows = preparedStatement.executeUpdate();
            System.out.println("受影响行数"+affectedRows);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void JdbcTest(){
        try {
//            加载驱动
            Class.forName("com.mysql.jdbc.Driver");
//            准备参数
            String url= "jdbc:mysql://localhost:3306/dev01";
            String user= "root";
            String password= "root";
//            获取连接
            Connection connection = getConnection(url, user, password);
//            准备参数
            String sql = "select * from student";
//            获取预处理搬运工对象
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            执行sql，获取结果集对象
            ResultSet resultSet = preparedStatement.executeQuery();
//            准备一个集合，用来储存学生对象
            List<Student> list = new ArrayList<>();

//            遍历结果集对象（迭代）
            while (resultSet.next()){
//                获取指定字段的值
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                Date birthday  =resultSet.getDate("birthday");
                String info = resultSet.getString("info");

//                将得到结果封装到对象中
                Student student = new Student(id,name,age,gender,birthday,info);

//                将对象放到集合中
                list.add(student);
            }
//            遍历list
            for (Student student :list){
                System.out.println(student);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
