package com.fc.controller;

import com.fc.controller.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@ResponseBody
public class ADIVCE {
    @ExceptionHandler(MyException.class)
    public Map<String,Object> Test(MyException e){
        Map<String, Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("message",e.getMessage());
        return map;
    }
}
