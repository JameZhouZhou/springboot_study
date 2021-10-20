package com.cuit.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *
 *          创建异步任务
 */

@Service
public class AsyncService  {

    @Async
    public void batchAdd(){
        try{
            //模拟新增数据
            Thread.sleep(3*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("批量新增数据完成");

    }
}
