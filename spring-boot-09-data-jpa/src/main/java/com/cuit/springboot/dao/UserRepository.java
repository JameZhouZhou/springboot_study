package com.cuit.springboot.dao;

import com.cuit.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
//指定的泛型<操作的实体类，主键的数据类型>
public interface UserRepository  extends JpaRepository<User,Integer> {

}
