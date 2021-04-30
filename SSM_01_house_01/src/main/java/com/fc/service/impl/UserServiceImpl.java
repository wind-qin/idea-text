package com.fc.service.impl;

import com.fc.bean.User;
import com.fc.dao.UserMapper;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName( String username, String password, String type ) {
        return userMapper.findByName(username,password,type);
    }
}
