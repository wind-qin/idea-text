package com.fc.dao.impl;

import com.fc.bean.User;
import com.fc.dao.DaoUser;

public class DaoUserImpl implements DaoUser {
    @Override
    public User getUser() {
        System.out.println("连接数据库");
        return new User("卢老卢",21);
    }
}
