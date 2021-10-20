package com.cuit.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@Controller
public class EmpController {

    /**注入值*/
    @Value("${emp.last-name}")
    private String name;

    /**配置请求路径和响应body*/
    @ResponseBody
    @RequestMapping("/say")
    public String sauHello()
    {
        return "say hello "+name;
    }

}
