package com.cuit.springboot.entity;


import javax.persistence.*;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *
 *      JPA采用的是ORM(对象关系映射)模型
 *
 *      强调 Hibernate 在创建表时，
 *      默认创建表类型是MyISAM,是非事务安全的，所以无法实现事物回滚;
 *      Innodb才可以进行对事物的回滚
 */

@Entity     //说明 它是和数据表映射的类
@Table(name = "tbl_user")  //指定对应映射表名，省略不写---默认是类名
public class User {



    @Id //指定主键
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "user_name",length = 5) //指定对应数据表的字段
    private  String username;

    @Column //省略不写默认字段名就是属性名
    private  String password;

    public User(String username,String password) {
        this.username=username;
        this.password=password;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
