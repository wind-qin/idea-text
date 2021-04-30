package com.fc.text;

import com.fc.service.UserService;
import com.fc.service.impl.UserServiceImpl;
import org.junit.Test;

public class Text {

    @Test
    public void text(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.getUser();

    }
}
