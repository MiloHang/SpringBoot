package com.hss.spring.aware;

import org.springframework.stereotype.Component;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
@Component
public class Bean1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
