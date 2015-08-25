package com.larry.Utils;

/**
 * Created by larry on 15-8-25.
 * 记录性能监视信息
 */
public class MethodePerformance {
    private long begin;
    private long end;
    private String serviceMethod;

    public MethodePerformance(String serviceMethod) {
        //记录目标类方法开始执行点的系统时间
        this.begin = System.currentTimeMillis();
        this.serviceMethod = serviceMethod;
    }

    public void printPerformance(){
        end = System.currentTimeMillis();
        long elapse = end - begin;

        System.out.printf("%s花费%d毫秒.", serviceMethod,elapse);
        System.out.println();
    }

    public static void main(String[] args){
        String serviceMethod = "MethodService";
        long elapse = 1000;
        System.out.printf("%s花费%d毫秒.", serviceMethod, elapse);

    }
}
