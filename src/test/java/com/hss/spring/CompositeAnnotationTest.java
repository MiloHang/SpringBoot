package com.hss.spring;

import com.hss.spring.composite_annotation.AnnotationConfig;
import com.hss.spring.composite_annotation.DemoBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
public class CompositeAnnotationTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getName());
    }
}
