package com.fc.controller;

import com.fc.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test")
public class UserController {

    @RequestMapping("userTest")
    public Map<String,Object> getRequest( User user ){
        System.out.println(user);
        Map<String, Object> map = new HashMap<>();
        map.put("code",200);
        map.put("success",false);
        map.put("message","请求成功！");
        map.put("data",new User("赵老卢","123",12,"想干嘛"));
//
//        try {
//            System.out.println("延迟时间");
//            Thread.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return map;
    }
}
