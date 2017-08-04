package com.hss.spring.start;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by shaoshi.hang on 2017/7/28.
 *
 * @ComponentScan 开启组件扫描
 * @Configuration 声明是配置类, 相当于XML文件
 */
@Configuration
@ComponentScan("com.hss.spring.*")
@EnableAspectJAutoProxy
public class Config2 {
}
