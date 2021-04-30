package com.fc.controller;

import com.fc.Service.UserService;
import com.fc.Service.impl.UserServiceImpl;
import com.fc.bean.User;

public class UserController {
    private UserService userSerVice;

    public User getUser(){
        return userSerVice.getUser();
    }

    public void setUserSerVice( UserService userSerVice ) {
        this.userSerVice = userSerVice;
    }
}
