package com.hss.spring.aop;

import org.springframework.stereotype.Service;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */
@Service
public class DemoAnnotationService {
    @Log(msg = "使用了add方法")
    public void add(int value) {
        System.out.println(value);
    }
}
