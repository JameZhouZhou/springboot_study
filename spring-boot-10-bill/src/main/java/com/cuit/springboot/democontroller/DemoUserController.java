package com.cuit.springboot.democontroller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cuit.springboot.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City 1
 */
@Controller
public class DemoUserController {

    @ResponseBody
    @GetMapping("/xixi")
    public String xixi(Map<String,Object> map){

        String xixi = "xixi";

        return xixi;
    }

    @GetMapping("/getUsers")
    public String getUser(Map<String,Object> map){
        List<User1> list = new ArrayList<>();

        System.out.println("111111111111111111111111111");
        list.add(new User1("1","2"));
        list.add(new User1("1","2"));
        list.add(new User1("1","2"));
        map.put("users",list);

        return "demo/list";

    }

    @ResponseBody
    @PostMapping("/user222")
    public String  getUserList(@RequestBody String json ){

          System.out.println(json);
                 /*
        [{"id":"1","name":"2"},{"id":"1","name":"2"},{"id":"1","name":"2"}]
       */
        System.out.println("方式一：");
        List<User1> list = JSON.parseArray(json,User1.class);
        System.out.println(list.get(0));

       /*
         {"userLst":[{"id":"1","name":"2"},{"id":"1","name":"2"},{"id":"1","name":"2"}]}
       */
//        System.out.println("方式二：");
//        JSONObject jsonobject = JSONObject.parseObject(json);
//        JSONArray jsonArray = JSONArray.parseArray(jsonobject.get("userLst").toString());
//        List<User1> list1 = jsonArray.toJavaList(User1.class);
//        System.out.println(list1.get(0));

        return "xixi";
    }
}
