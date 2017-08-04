package com.hss.spring.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */
public class Main2 {
    public static void main(String[] argv) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);
        Service2 service2 = context.getBean(Service2.class);
        UserService2 userService2 = context.getBean(UserService2.class);


        System.out.println(service2.sayHello("funck"));
        System.out.println(userService2.sayHelloTo("shaoshi.hang"));


    }
}
