package com.hss.spring.aop;

import org.springframework.stereotype.Service;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */
@Service
public class DemoMethodService {

    public String add(String value) {
        return value;
    }

}
