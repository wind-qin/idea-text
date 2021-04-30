package com.fc.service.impl;

import com.fc.bean.User;
import com.fc.dao.UserDao;
import com.fc.dao.impl.UserDaoImpl;
import com.fc.service.UserService;

// 业务层用来连接Controller和dao，粘合剂
//业务层不能访问数据库
public class UserServiceImpl implements UserService {

    // 创建一个dao层接口实现类
    private UserDao userDao = new UserDaoImpl();

    @Override
    public User getUser() {
        return userDao.getUser();
    }

    @Override
    public void setUserDao( UserDao userDao ) {

        this.userDao=userDao;

    }
}
