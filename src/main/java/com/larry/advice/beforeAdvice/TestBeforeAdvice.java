package com.larry.advice.beforeAdvice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by larry on 15-8-27.
 *
 */
public class TestBeforeAdvice {
    public static void main(String[] args){
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();

        ProxyFactory pf = new ProxyFactory();

        pf.setTarget(target);

        pf.addAdvice(advice);

        Waiter proxy = (Waiter) pf.getProxy();

        proxy.greetTo("Larry");
        proxy.serveTo("Tom");
    }
}
