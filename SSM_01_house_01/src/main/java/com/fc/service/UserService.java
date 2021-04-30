package com.fc.service;

import com.fc.bean.User;

public interface UserService {

    User findByName( String username, String password, String type );
}
