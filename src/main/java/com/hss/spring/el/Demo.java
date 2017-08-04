package com.hss.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by shaoshi.hang on 2017/7/31.
 */
@Service
public class Demo {
    @Value("Bean's comment")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
