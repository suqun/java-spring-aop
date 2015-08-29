package com.larry.advice.before;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by larry on 15-8-27.
 * Before Advice
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args,Object obj) throws Throwable{
        String clientName = (String)args[0];
        System.out.println("How are you! Mr." + clientName + ".");
    }
}
