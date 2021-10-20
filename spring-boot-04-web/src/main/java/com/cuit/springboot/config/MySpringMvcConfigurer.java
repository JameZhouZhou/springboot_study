package com.cuit.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

/**
 * 1.创建一个WebMvcConfigurer类型的子类
 * 2.类上用@Configuration标志其是一个配置类
 * 3.不能用@EnableWebMvc标识
 */


//@EnableWebMvc  这是完全掌控 即去掉springMvc自动配置的内容 自己去搞
@Configuration
public class MySpringMvcConfigurer implements WebMvcConfigurer {

    //增加视图控制
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //发送 /mengxuegu 请求来到 success.html   执行/execute时会put但执行/mengxuegu时直接进入界面
        registry.addViewController("/mengxuegu").setViewName("success");
    }
}