package com.cuit.springboot;

import org.junit.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

public class TestVersion {
    @Test
    public void Test1(){
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println(version+version1);
    }

}
