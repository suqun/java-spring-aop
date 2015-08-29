package com.larry.advice.before;

import com.larry.advice.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by larry on 15-8-27.
 *
 */
public class TestBeforeAdviceForXml {
    public static void main(String[] args){
        String configPath = "classpath:beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.serveTo("larry");
    }
}
