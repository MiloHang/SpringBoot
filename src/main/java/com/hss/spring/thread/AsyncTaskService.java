package com.hss.spring.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeTask(int i) throws InterruptedException {
        System.out.println("执行任务: " + i);

    }

    @Async
    public void executeTaskPlus(int i) throws InterruptedException {
        System.out.println("执行任务: " + i + 1);
        Thread.sleep(2000);
    }
}
