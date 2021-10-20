package com.cuit.springboot06.config;

import com.cuit.springboot06.filter.MyFilter;
import com.cuit.springboot06.listener.MyListener;
import com.cuit.springboot06.servlet.HelloServlet;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *
 *          注册三大组件
 * /



    /**
     * 注册Servlet组件
     *
     */
@Configuration
public class MyservletConfig {

    /**
     * 定制器配置servlet配置
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer() {
            @Override
            public void customize(WebServerFactory factory) {
                ConfigurableServletWebServerFactory factory1=
                        (ConfigurableServletWebServerFactory)factory;
                //修改端口号  若与配置文件冲突，以定制器为主
                factory1.setPort(8082);
                factory1.setContextPath("/servlet2");
            }
        };
    }



    @Bean
    public ServletRegistrationBean helloServlet(){
        ServletRegistrationBean bean
                = new ServletRegistrationBean(new HelloServlet(), "/hello");

        bean.setLoadOnStartup(1);
        return bean;
    }

    /**
     * 注册Filter组件
     *
     */
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        //设置自定义Filter
        bean.setFilter(new MyFilter());
        //过滤哪一些请求
        bean.setUrlPatterns(Arrays.asList("/hello"));
        return bean;
    }

    /**
     * 注册监听器
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean myLister(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new MyListener());
        return bean;
    }


}
