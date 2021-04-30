package com.fc.service.impl;

import com.fc.bean.User;
import com.fc.dao.UserDao;
import com.fc.dao.impl.UserDaoImpl;
import com.fc.service.UserService;
//业务层
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public User getUser() {
        return userDao.getUser();
    }
}
