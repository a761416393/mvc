package com.example.springboot.mvc.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

@WebFilter(urlPatterns = "/login/*",filterName = "loginFilter")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("--------拦截器进入--第一次访问初始化----"+filterConfig.toString());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-------拦截中--------");

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse) servletResponse);
        if (httpServletRequest.getRequestURI().indexOf("/login")!=-1){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            System.out.println("跳登录页面");
            wrapper.sendRedirect("/OK");
        }

    }

    @Override
    public void destroy() {
        System.out.println("-------拦截销毁----随web对象的销毁而销毁----");

    }
}
