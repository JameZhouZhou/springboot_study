package com.cuit.springboot.democontroller;

import lombok.Data;

import java.io.Serializable;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */


public class User1 implements Serializable {
        private String id;
        private String name;

    public User1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public User1() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
