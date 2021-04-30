package com.fc.dao.impl;

import com.fc.bean.User;
import com.fc.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public User getUser() {
        System.out.println("连接数据库");
        return null;
    }
}
