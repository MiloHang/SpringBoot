package com.hss.spring;

import com.hss.spring.thread.AsyncTaskService;
import com.hss.spring.thread.TaskExecutorConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
public class TaskTest {
    @Test
    public void test() throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i = 0; i < 20; i++) {
            asyncTaskService.executeTask(i);
            asyncTaskService.executeTaskPlus(i);
            System.out.println("别阻塞啊" + i);
        }
    }
}
