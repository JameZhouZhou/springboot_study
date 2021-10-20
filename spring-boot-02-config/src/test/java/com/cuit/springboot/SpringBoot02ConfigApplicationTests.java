package com.cuit.springboot;

import com.cuit.springboot.bean.Emp;

import com.cuit.springboot.service.EmpService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

    @Autowired
    Emp emp;

    @Autowired
    ApplicationContext context;

    /**对xml文件的配置 */
    @Test
    public void testXml(){

        //这是xml的注入Test
//        EmpService empService =(EmpService) context.getBean("empService");
//        System.out.println(empService);
//        empService.add();

        //这是自定义配置的Test
        EmpService empService2 = (EmpService)context.getBean("empService2");
        System.out.println("empService2: " + empService2);
    }


//    @Test
//    public void contextLoads() {
//        System.out.println(emp);
//    }

}
