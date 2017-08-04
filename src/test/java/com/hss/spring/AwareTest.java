package com.hss.spring;

import com.hss.spring.aware.AwareService;
import com.hss.spring.aware.Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
public class AwareTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AwareService awareService = context.getBean(AwareService.class);

        awareService.outputResult();
    }
}
