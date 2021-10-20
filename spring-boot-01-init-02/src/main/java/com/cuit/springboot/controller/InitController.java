package com.cuit.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@Controller
public class InitController {

    @ResponseBody
    @RequestMapping("/info")
    public String init()
    {
        return "hello zxy";
    }

}
