package com.hss.spring.start;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */
public class UserService3 {
    private Service3 service3;

    public void setService3(Service3 service3) {
        this.service3 = service3;
    }

    public String sayHello(String name) {
        return service3.syaHello(name);
    }
}
