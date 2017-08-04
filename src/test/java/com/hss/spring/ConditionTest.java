package com.hss.spring;

import com.hss.spring.conditional.ConditionConfig;
import com.hss.spring.conditional.ListService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
public class ConditionTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);

        System.out.println(listService.showListCmd());
    }
}
