package com.larry.jkdproxy;

import com.larry.Utils.PerformanceMonitor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.Object;

/**
 * Created by larry on 15-8-25.
 * 横切逻辑代码同业务逻辑代码编织到一起的类
 *
 */
public class PerformanceHandler implements InvocationHandler{

    private Object target;//目标的业务类

    public PerformanceHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //开始对方法进行性能监视
        PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());

        //通过反射方法调用业务类的目标方法
        Object object = method.invoke(target,args);

        PerformanceMonitor.end();
        return object;
    }
}
