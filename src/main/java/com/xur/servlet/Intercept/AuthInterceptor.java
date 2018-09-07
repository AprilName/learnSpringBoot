package com.xur.servlet.Intercept;

/**
 * 添加拦截器 AuthInterceptor 继承字 HandlerInterceptorAdapter 重写 preHandle 方法
 * 所有方法先进这里
 */

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {

}
