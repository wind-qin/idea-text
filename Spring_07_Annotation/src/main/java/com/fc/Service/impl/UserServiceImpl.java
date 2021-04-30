package com.fc.Service.impl;

import com.fc.Service.UserService;
import com.fc.bean.User;
import com.fc.dao.DaoUser;
import com.fc.dao.impl.DaoUserImpl;

public class UserServiceImpl implements UserService {
    private DaoUser daoUser;

    @Override
    public User getUser() {
        return daoUser.getUser();
    }

//   不写死 set传参 用set方法传值
    public void setDaoUser( DaoUser daoUser ) {
        this.daoUser = daoUser;
    }
}
