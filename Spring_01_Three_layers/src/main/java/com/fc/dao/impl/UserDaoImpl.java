package com.fc.dao.impl;

import com.fc.bean.User;
import com.fc.dao.UserDao;

//dao就是连接数据库的
public class UserDaoImpl implements UserDao {
    @Override
    public User getUser() {
        System.out.println("dao连接数据库");

//            Class.forName("com.mysql.jdbc.Driver");
//
//            Connection connection = DriverManager.getConnection("url", "用户名", "密码");
//
//            PreparedStatement select_ = connection.prepareStatement("select ");
//
//            int affectedRows = select_.executeUpdate();
//        ResultSet resultSet = select_.executeQuery();
//        User user = null;
//
//        如果结果集还有下一步
//        while (resultSet.next()){
//        拿到数据库对应字段的数据
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//              封装到User对象里面
//            User = new User(id,name)
//
//        }
//
//
//        return user;

        return null;
    }
//    增删改查


}
