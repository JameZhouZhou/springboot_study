package com.cuit.springboot.controller;

import com.cuit.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 * @ResponseBody         作用：将方法的返回值，以特定的格式写入到response的body区域，进而将数据返回给客户端。
 *         当方法上面没有写ResponseBody,底层会将方法的返回值封装为ModelAndView对象。
 *         如果返回值是字符串，那么直接将字符串写到客户端；如果是一个对象，会将对象转化为json串，然后写到客户端。
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/success")
    public String execute() {
        return "Hello ttjj ";
    }


    @RequestMapping("/execute")
    /**   执行/execute时会put但执行/mengxuegu时直接进入界面     */
    public String success(Map<String, Object> map) {
        map.put("name", "梦学谷");

        //找classpath:/templates/success.html
        return "success";
    }

    @RequestMapping("/study")
    public String study(Map<String, Object> map, HttpServletRequest request) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("小梦", 1));
        userList.add(new User("小李", 2));
        userList.add(new User("小静", 1));

        map.put("userList", userList);

        map.put("sex", 1);
        map.put("man", 1);

        // th:text                th:utext 不转义特殊字符
        map.put("desc", "欢迎来到<h1>梦学谷<h1>");
        request.getSession().setAttribute("user", new User("小不点", 2));

        return "study";
    }
}
