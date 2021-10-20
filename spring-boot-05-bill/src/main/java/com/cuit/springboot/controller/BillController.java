package com.cuit.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

@Controller
public class BillController {


    @GetMapping("/bills")
    public String list(){
        //模拟500
//        int i=1/0;

        //模拟运行时异常，自定义异常信息 [[${message}]]
        int i=0;
        if(i==0){
            throw new RuntimeException("i不能为0");
        }


        return "bill/list";
    }
}
