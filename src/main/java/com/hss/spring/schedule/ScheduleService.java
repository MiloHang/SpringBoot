package com.hss.spring.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
@Service
public class ScheduleService {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void printCurrentTime() {
        System.out.println("当前时间：" + SIMPLE_DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "0 40 19 ? * *")
    public void fixTimeExecution() {
        System.out.println("指定时间: " + SIMPLE_DATE_FORMAT.format(new Date()));
    }

}
