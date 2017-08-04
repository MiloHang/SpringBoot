package com.hss.spring.start;

import org.springframework.stereotype.Service;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */
@Service
public class Service2 {
    public String sayHello(String s) {
        return "Hello World!" + s;
    }
}

