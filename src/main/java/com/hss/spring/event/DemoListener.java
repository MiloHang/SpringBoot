package com.hss.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */

@Component
public class DemoListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (!(event instanceof DemoEvent))
            return;
        String msg = ((DemoEvent) event).getMsg();
        System.out.println("监听：收到了消息: " + msg);
    }
}
