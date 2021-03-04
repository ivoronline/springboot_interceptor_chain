package com.ivoronline.springboot_interceptor_chain.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor1 implements HandlerInterceptor {

  //====================================================================
  // PRE HANDLE
  //====================================================================
  @Override
 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
  System.out.println("MyInterceptor1: preHandle()       ");
  return true;
 }

  //====================================================================
  // POST HANDLE
  //====================================================================
 @Override
 public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
   System.out.println("MyInterceptor1: postHandle()      ");
 }

  //====================================================================
  // AFTER COMPLETION
  //====================================================================
 @Override
 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) {
   System.out.println("MyInterceptor1: afterCompletion() ");
 }

}
