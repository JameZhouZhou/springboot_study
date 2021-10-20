package com.cuit.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

@Controller
public class LoginController {

    @PostMapping("/login")                   //必须要对应页面中form表单的属性
    public String login(HttpSession session,String username, String password, Map<String,Object>map) {
        //判断用户名不为空，密码为123，则登录成功
        if(!StringUtils.isEmpty(username)&&password.equals("123"))
        {
            session.setAttribute("loginUser",username);
            //登录成功      重定向解决表单问题？
            return "redirect:/main.html";
        }

        //登录失败
        map.put("msg","用户名或密码错误05");
        return "main/login";
    }

    //退出登录
    @GetMapping("/logout")
    public String logout(HttpSession session){
        //1.清空session中的用户信息
        session.removeAttribute("loginUser");
        //2.再将session进行注销
        session.invalidate();
        //3.返回登录页面       指定的是视图控制里的请求路径
        return "redirect:/index.html";
    }

}

