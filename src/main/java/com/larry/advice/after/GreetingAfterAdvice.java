package com.larry.advice.after;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by larry on 15-8-29.
 *
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        //在目标类方法调用后执行
        System.out.println("Please enjoy yourself!");
    }
}
