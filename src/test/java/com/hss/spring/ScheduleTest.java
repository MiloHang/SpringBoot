package com.hss.spring;

import com.hss.spring.schedule.ScheduleConfig;
import com.hss.spring.schedule.ScheduleService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
public class ScheduleTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
        ScheduleService scheduleService = context.getBean(ScheduleService.class);
        while (true) ;//确保程序在运行
    }
}
