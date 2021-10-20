package com.cuit.springboot.service;

import com.cuit.springboot.entities.User;
import com.cuit.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@CacheConfig(cacheNames = "user")//指定在类上，方法上就不需要写缓存名
@Service
public class UserService implements Serializable {

    @Autowired
    UserMapper userMapper;

    /**
     *
     * key是容器中的key值，value是这个方法的返回值
     * @param id
     * @return
     */
    //必须指定缓存名称
    @Cacheable(/*cacheNames = "user",*/key = "#id")
    public User getUserById(Integer id){
        User user = userMapper.getUserById(id);

        return user;
    }

    //必须指定缓存名称
    @CachePut(/*cacheNames = "user",*/key = "#user.id")
    public User updateUser(User user){

         userMapper.updateUser(user);
        return user;
    }

    /**
     * 默认不会删除缓存的数据
     * allEntriser = true 会将缓存中所有数据清空       方法执行后清空
     * beforeInvocation = true,为true的时候会调用缓存清空 方法执行之前清空
     */
    @CacheEvict(/*cacheNames = "user",*/key = "#id",allEntries = true,beforeInvocation = true)
    public Integer deleteUserById(Integer id){
//        int i = 1/0;
        userMapper.deleteUserById(id);
        return id;
    }



}
