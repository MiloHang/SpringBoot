package com.hss.spring.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shaoshi.hang on 2017/7/28.
 * Spring的Java配置方式
 *
 * @Configuration 声明是配置类
 */
@Configuration
public class Config3 {
    @Bean
    public Service3 service3() {
        return new Service3();
    }

    /**
     * 无参构造Bean
     */
    @Bean
    public UserService3 userService3() {
        UserService3 userService3 = new UserService3();
        userService3.setService3(service3());
        return userService3;
    }

    /**
     * 有参构造Bean
     */
    @Bean
    public UserService3 userService3(Service3 service3) {
        UserService3 userService3 = new UserService3();
        userService3.setService3(service3);
        return userService3;
    }

}
