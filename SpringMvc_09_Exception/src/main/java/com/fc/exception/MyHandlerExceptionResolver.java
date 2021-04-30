//package com.fc.exception;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
////创建一个对象通过spring进行管理
//@Configuration
//public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
//    @Override
//    public ModelAndView resolveException( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex ) {
////        创建一个ModelAndView
//        ModelAndView modelAndView = new ModelAndView();
//
////        判断抛出的异常是否为自定义的异常并添加到modelAndView中
//        if (ex instanceof MyException){
//            System.out.println("自定义异常被处理");
//        }else {
//            System.out.println("系统异常被处理");
//        }
//
//        modelAndView.addObject("message",ex.getMessage());
//
////        设置跳转视图
//        modelAndView.setViewName("/index.jsp");
//
//
//        return modelAndView;
//    }
//}
