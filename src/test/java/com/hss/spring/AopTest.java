package com.hss.spring;

import com.hss.spring.aop.DemoAnnotationService;
import com.hss.spring.aop.DemoMethodService;
import com.hss.spring.start.Config2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */
public class AopTest {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add(2);

        context.close();
    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoMethodService.add("2222");

        context.close();
    }
}
