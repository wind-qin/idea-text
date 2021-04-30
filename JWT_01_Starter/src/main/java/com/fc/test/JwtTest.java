package com.fc.test;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.junit.Test;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {

    @Test
    public void testJwt(){
//        声明一个头部
        Map<String, Object> header = new HashMap<>();

        header.put("alg","HS256");
        header.put("typ","JWT");

//        声明一个日期格式
        Calendar expireTime = Calendar.getInstance();
//        指定时间为1分钟
        expireTime.add(Calendar.MINUTE,1);

//        创建一个token
       String token  = JWT.create()

//               携带指定头部
               .withHeader(header)
//               携带载荷
               .withClaim("id",1)
               .withClaim("username","小明")
               .withExpiresAt(expireTime.getTime())
//               提供加密的算法和盐值
               .sign(Algorithm.HMAC256("123456"));

        System.out.println(token);
    }
}
