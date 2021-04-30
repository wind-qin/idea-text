//package com.fc.exception;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@ControllerAdvice
//@ResponseBody
//public class GlobalExceptionHandler {
//
//
//    @ExceptionHandler(MyException.class)
//    public Map<String,Object> myException(MyException e){
//
//        Map<String, Object> map = new HashMap<>();
//
//        System.out.println("自定义异常");
//        map.put("code",-1);
//        map.put("massage",e.getMessage());
//        return map;
//
//    }
//
//    @ExceptionHandler(RuntimeException.class)
//    public Map<String,Object> SystemException(RuntimeException e){
//
//        Map<String, Object> map = new HashMap<>();
//
//        System.out.println("系统异常");
//        map.put("code",-1);
//        map.put("massage",e.getMessage());
//        return map;
//    }
//}
