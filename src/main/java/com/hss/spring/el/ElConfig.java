package com.hss.spring.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by shaoshi.hang on 2017/7/29.
 */
@Configuration
@ComponentScan("com.hss.spring")
@PropertySource("classpath:test.properties")
public class ElConfig {
    @Value("normal txt")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double number;

    @Value("#{demo.name}")
    private String demoName;

    @Value("classpath:hello.txt")
    private Resource file;

    @Value("https://www.baidu.com")
    private Resource url;

    /*@Value("q{book.name}")
    private String bookName;*/

    @Autowired
    private Environment environment;

    public void output() {
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(demoName);
        System.out.println(number);
        try {
            System.out.println(IOUtils.toString(file.getInputStream()));
            System.out.println(IOUtils.toString(url.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(environment.getProperty("book.name"));

    }

}

