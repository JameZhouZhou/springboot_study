package com.cuit.springboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

@Configuration
public class myBatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        ConfigurationCustomizer configurationCustomizer = new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                //开启驼峰命名方式
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
        return  configurationCustomizer;
    }

}
