package com.hss.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by shaoshi.hang on 2017/8/3.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware, BeanFactoryAware {
    private String beanName;
    private ResourceLoader resourceLoader;
    private BeanFactory beanFactory;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void outputResult() {
        System.out.println("Bean's name: " + beanName);
        Resource resource = resourceLoader.getResource("classpath:hello.txt");
        System.out.println(beanFactory.isSingleton(beanName));
        try {
            System.out.println("加载的文件内容是：" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
