package com.cuit.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

@RestController//等价于@Controller和@ResponseBody返回json
public class ProviderController {
        @Autowired
        JdbcTemplate jdbcTemplate;

        @GetMapping("/providers")
        public Map list(){
            List<Map<String,Object>> maps =
                    jdbcTemplate.queryForList("select * from provider");
            System.out.println(maps);
            return maps.get(0);
        }

}
