package com.cuit.springboot.controller;/*
 * Author:        Mirrors
 * @version       JDK  V10.0
 * @Description:  Chengdu City
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello word";
    }
}
