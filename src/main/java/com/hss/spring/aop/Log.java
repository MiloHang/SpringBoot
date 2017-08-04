package com.hss.spring.aop;

import java.lang.annotation.*;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    String msg();
}


