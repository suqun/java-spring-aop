package com.larry.jkdproxy;

import java.lang.reflect.Proxy;

/**
 * Created by larry on 15-8-25.
 * 通过JDK的动态代理实现
 * JDK创建代理有一个限制，只能为接口创建代理实例
 */
public class ForumServiceTest {

    public static void main(String[] args){
        //希望被代理的目标业务类
        ForumService target = new ForumServiceImpl();

        //将目标类和横切代码编织到一起
        PerformanceHandler handler = new PerformanceHandler(target);

        //根据编织了目标业务逻辑和性能监视横切逻辑的InvocationHandler实例创建代理实例
        ForumService proxy = (ForumService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        //调用代理实例
        proxy.removeTopic(1001);
        proxy.removeForum(1025);
    }
}
