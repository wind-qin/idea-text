package com.fc.controller;

import com.fc.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//使用注解进行全局的异常处理
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(MyException.class)
    public Map<String, Object> ExceptionController(MyException e){
        Map<String, Object> map = new HashMap<>();

        System.out.println("自定义异常被处理");
        map.put("code",-1);
        map.put("message" ,e.getMessage());

        return map;
    }

    @ExceptionHandler(RuntimeException.class)
    public Map<String,Object> SystemException(RuntimeException e){
        Map<String, Object> map = new HashMap<>();
        System.out.println("系统异常被处理");
        map.put("code",-1);
        map.put("message" ,e.getMessage());
        return map;
    }


}
