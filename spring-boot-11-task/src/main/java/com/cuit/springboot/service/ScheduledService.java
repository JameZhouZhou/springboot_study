package com.cuit.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *
 *          创建定时任务
 */
@Service
public class ScheduledService {
    private  static  int count=1;

    /*
     *
     * 秒 分 时 日 月 星期几
     * 比如: "0 * * * * MON-FRI" 周一到周五, 每次0秒执行(即每分钟执行一次)
     */
                    //每隔3秒执行一次 周一到周五
    @Scheduled(cron =" */3 * * * * *" )   //今天是周日 。。。hah
    public void dataCount(){
        System.out.println("数据统计第"+count++ +"次");
    }
}
