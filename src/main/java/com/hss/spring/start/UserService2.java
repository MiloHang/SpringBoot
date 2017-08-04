package com.hss.spring.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */
@Service
public class UserService2 {
    @Autowired
    private Service2 service2;

    public String sayHelloTo(String name) {
        return service2.sayHello(name);
    }
}
