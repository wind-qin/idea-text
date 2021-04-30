package com.fc.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class MyHandlerException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex ) {
        ModelAndView vm = new ModelAndView();
        if (ex instanceof MyException){
            System.out.println("自定义异常~~~");
        }else {
            System.out.println("系统异常");
        }
        vm.addObject("message",ex.getMessage());

        vm.setViewName("/error.jsp");

        return vm;
    }
}
