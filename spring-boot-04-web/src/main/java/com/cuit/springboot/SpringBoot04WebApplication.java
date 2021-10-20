package com.cuit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringBoot04WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot04WebApplication.class, args);
    }


    @Bean
    public ViewResolver myViewResolver() {
        return new MyViewResolver();
    }

    private class MyViewResolver implements ViewResolver {
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }  // DispatcherServlet.doDispatch 断点后,发送任意请求，可查看已被容器自动管理了
}
