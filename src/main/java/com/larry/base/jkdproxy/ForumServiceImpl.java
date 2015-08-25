package com.larry.base.jkdproxy;

/**
 * Created by larry on 15-8-25.
 * 移除横切逻辑
 */
public class ForumServiceImpl implements ForumService {
    public void removeTopic(int topicId) {
//        //开始对该方法进行性能监视
//        PerformanceMonitor.begin("com.larry.withoutproxy.ForumServiceImpl.removeTopic");

        System.out.println("模拟删除Topic记录：" + topicId);

        try {
            Thread.currentThread().sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        //结束对该方法进行性能监视
//        PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
//        //开始对该方法进行性能监视
//        PerformanceMonitor.begin("com.larry.withoutproxy.ForumServiceImpl.removeForum");

        System.out.println("模拟删除Forum记录：" + forumId);

        try {
            Thread.currentThread().sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        //结束对该方法进行性能监视
//        PerformanceMonitor.end();
    }
}
