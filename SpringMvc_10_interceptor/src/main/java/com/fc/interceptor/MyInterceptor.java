package com.fc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

//    handler执行之前会执行，如果返回值为true，继续执行下一个拦截器，直到到达拦截器链的链尾
//    如果返回值为false直接返回
    @Override
    public boolean preHandle( HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception {
        System.out.println("拦截器前置处理 ");
        return true;
    }

//    handler执行后会执行此方法
    @Override
    public void postHandle( HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView ) throws Exception {
        System.out.println("拦截器后置处理 ");
    }
//渲染完成后执行
    @Override
    public void afterCompletion( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex ) throws Exception {

        System.out.println("拦截器渲染完成后执行"+handler);
    }
}

