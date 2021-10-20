package com.cuit.springboot.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *
 *          国际化
 */

public class MyLocaleResolver implements LocaleResolver {

    //解析区域信息
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {

        //获取自定义请求头信息
       String l =httpServletRequest.getParameter("l");
        //获取系统 默认区域信息
       Locale locale= Locale.getDefault();

        if(!StringUtils.isEmpty(l)){
           String[] split = l.split("_");
            //接受第一个参数为: 语言代码  国家代码
            locale =new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
