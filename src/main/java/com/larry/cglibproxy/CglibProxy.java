package com.larry.cglibproxy;

import com.larry.Utils.PerformanceMonitor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by larry on 15-8-25.
 * cglib动态代理：字节码技术创建子类，并在子类中采用方法拦截技术拦截所有父类的调用，并顺势织入横切代码
 */
public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        //设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return enhancer.create();
    }
    //拦截父类所有方法的调用
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //开始对方法进行性能监视
        PerformanceMonitor.begin(o.getClass().getName()+"."+method.getName());
        //通过代理类调用父类中的方法
        Object result = methodProxy.invokeSuper(o,objects);

        PerformanceMonitor.end();
        return result;
    }
}
