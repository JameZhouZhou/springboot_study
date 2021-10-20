package com.cuit.springboot.entity;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

public class User {
    private String username;
    private Integer gender;

    public User() {
    }

    public User(String username, Integer gender) {
        this.username = username;
        this.gender = gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public Integer getGender() {
        return gender;
    }
}
