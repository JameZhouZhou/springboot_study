package com.cuit.springboot;

import com.cuit.springboot.entities.User;
import com.cuit.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot13CacheApplicationTests {

    //操作的是复杂类型，User
    @Autowired
    RedisTemplate redisTemplate;
    //针对的都是操作字符串
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate jsonRedisTemplate;

    @Autowired
    UserService userService;

    /**
     *     stringRedisTemplate.opsForValue(); //操作字符串
 *         stringRedisTemplate.opsForList();//操作List
 *         stringRedisTemplate.opsForSet();//操作Set
 *         stringRedisTemplate.opsForZSet();//操作ZSet
 *         stringRedisTemplate.opsForHash();//操作Hash
     *
     */
    @Test
    void contextLoads() {
        stringRedisTemplate.opsForValue().set("name","cuit"); //操作字符串

    }
    @Test
    public void  testRedis(){

        User user=userService.getUserById(1);
        //保存的数据对象必须序列化 implements Serializable
        //因为redisTemplate默认采用的是jdk序列化器
      //  redisTemplate.opsForValue().set("user",user);
        User user1 = (User) redisTemplate.opsForValue().get("user");
        System.out.println(user1);


        jsonRedisTemplate.opsForValue().set("user2",user);
    }

}
