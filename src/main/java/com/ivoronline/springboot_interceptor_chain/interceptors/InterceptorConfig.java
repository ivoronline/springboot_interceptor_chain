package com.ivoronline.springboot_interceptor_chain.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Component
public class InterceptorConfig extends WebMvcConfigurationSupport {

  @Autowired MyInterceptor1 myInterceptor1;
  @Autowired MyInterceptor2 myInterceptor2;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    //ORDER IN WHICH THEY ARE ADDED DEFINES ORDER IN WHICH THEIR preHandle() METHODS ARE EXECUTED DURING REQUEST
    //THEIR postHandle() METHODS ARE EXECUTED IN REVERSE ORDER DURING HTTP RESPONSE
    registry.addInterceptor(myInterceptor1);
    registry.addInterceptor(myInterceptor2);
  }

}

