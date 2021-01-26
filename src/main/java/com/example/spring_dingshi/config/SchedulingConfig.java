package com.example.spring_dingshi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

@Configuration
public class SchedulingConfig implements SchedulingConfigurer {
    /**
     * @描述 所有的定时任务都放在一个线程池中,定时任务启动时使用不同的线程
     * @param
     * @作者 gc
     * @时间 2020/11/16 11:47
     * @return
     **/
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        //设定一个定时任务线程池,数量为10
        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(10));
    }

}

