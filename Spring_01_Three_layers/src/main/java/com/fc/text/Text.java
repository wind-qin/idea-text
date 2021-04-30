package com.fc.text;

import com.fc.dao.impl.UserDaoImpl;
import com.fc.service.impl.UserServiceImpl;
import org.junit.Test;

public class Text {
    @Test
    public void text(){
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoImpl());
        userService.getUser();


    }
}
