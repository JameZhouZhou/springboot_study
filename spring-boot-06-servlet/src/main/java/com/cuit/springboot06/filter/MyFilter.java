package com.cuit.springboot06.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化...filter");
    }

    @Override
    public void destroy() {
        System.out.println("销毁...filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤...filter 完成...");
        //放行请求
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
