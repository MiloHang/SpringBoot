package com.hss.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by shaoshi.hang on 2017/7/28.
 */
@Aspect
@Component
public class LogAspet {
    @Pointcut("@annotation(com.hss.spring.aop.Log)")
    public void pc1() {
    }

    ;

    @Pointcut("execution(* com.hss.spring.aop..*.*(..))")
    public void pc2() {
    }

    ;

    @Before("pc2()")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则式拦截：" + " " + method.getReturnType() + " " + method.getName()
                + " " + method.getParameterTypes()[0] + " " + joinPoint.getArgs()[0]
        );
    }

    @After("pc1()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        System.out.println(joinPoint.getArgs() + " " + joinPoint.getThis());
        Log log = method.getAnnotation(Log.class);
        System.out.println("注解拦截：" + "after " + log.msg() + ", " + log.toString());
    }
}
