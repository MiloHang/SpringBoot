package com.hss.spring;

import com.hss.spring.scope.Prototype;
import com.hss.spring.scope.Singleton;
import com.hss.spring.start.Config2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaoshi.hang on 2017/7/29.
 */
public class ScopeTest {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);
        Singleton singleton = context.getBean(Singleton.class);
        Singleton singleton1 = context.getBean(Singleton.class);

        if (singleton.equals(singleton1)) {
            System.out.println("Yes");

        } else
            System.out.println("no");

        context.close();
    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);
        Prototype prototype = context.getBean(Prototype.class);
        Prototype prototype1 = context.getBean(Prototype.class);

        System.out.println(prototype.equals(prototype1));
        context.close();
    }
}
