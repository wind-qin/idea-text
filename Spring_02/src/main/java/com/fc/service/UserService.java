package com.fc.service;


import com.fc.bean.User;
import com.fc.dao.UserDao;

public interface UserService {

    User getUser();

    void setUserDao( UserDao userDao );

}
