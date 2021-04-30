package com.fc.dao.impl;

import com.fc.bean.User;
import com.fc.dao.UserDao;

public class UserDaoImplMysql implements UserDao {
    @Override
    public User getUser() {

        System.out.println("换了mysql的数据库");
        return null;
    }
}
