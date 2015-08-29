package com.larry.advice.before;

import com.larry.advice.NaiveWaiter;
import com.larry.advice.Waiter;
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
        //spring 提供的代理工厂
        ProxyFactory pf = new ProxyFactory();
        //設置代理目標
        pf.setTarget(target);
        //为代理目标添加advice
        pf.addAdvice(advice);
        //生成代理实例
        Waiter proxy = (Waiter) pf.getProxy();

        proxy.greetTo("Larry");
        proxy.serveTo("Tom");
    }
}
