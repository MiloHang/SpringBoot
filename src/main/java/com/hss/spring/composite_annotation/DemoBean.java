package com.hss.spring.composite_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
@Service
public class DemoBean {
    @Value("test")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
