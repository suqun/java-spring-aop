package com.larry.Utils;

/**
 * Created by larry on 15-8-25.
 * 性能监视器
 */
public class PerformanceMonitor {
    //通过一个ThreadLocal保存调用线程相关的性能监视信息
    private static ThreadLocal<MethodePerformance> performnceRecord =
            new ThreadLocal<MethodePerformance>();

    //启动对某一个目标方法的性能监视
    public static void begin(String method){
        System.out.println("***begin monitor***");
        MethodePerformance methodePerformance = new MethodePerformance(method);
        performnceRecord.set(methodePerformance);
    }

    public static void end(){
        System.out.println("***end monitor***");
        MethodePerformance methodePerformance = performnceRecord.get();
        //打印出方法性能的监视结果信息
        methodePerformance.printPerformance();
    }
}
