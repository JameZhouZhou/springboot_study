package com.cuit.springboot.service.impl;

import com.cuit.springboot.dao.UserRepository;
import com.cuit.springboot.entity.User;
import com.cuit.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *             模拟事务管理
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;
    //isolation指定隔离级别       propagation指定传播行为
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED) //当前方法开启事务管理
    @Override
    public Boolean addUser(User user) {

        //模拟转账：转出
        userRepository.save(new User("1","1"));
        userRepository.save(new User("12","2"));
        userRepository.save(new User("123","3"));
        userRepository.save(new User("1234","4"));
        userRepository.save(new User("12345","5"));

        //转入： 模拟失败 username最大长度为5
        userRepository.save(new User("123456","6"));
        userRepository.save(new User("1234567","7"));


        userRepository.save(user);
        return  true;
    }
}
