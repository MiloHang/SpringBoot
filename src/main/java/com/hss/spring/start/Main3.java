package com.hss.spring.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */
public class Main3 {
    public static void main(String[] argv) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config3.class);
        UserService3 userService = context.getBean(UserService3.class);

        System.out.println(userService.sayHello("JavaConfig"));
    }
}
