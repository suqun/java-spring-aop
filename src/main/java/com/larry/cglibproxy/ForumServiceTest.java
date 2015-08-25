package com.larry.cglibproxy;

/**
 * Created by larry on 15-8-25.
 * 通过CGLib的动态代理实现
 *
 */
public class ForumServiceTest {

    public static void main(String[] args){
        CglibProxy proxy = new CglibProxy();
        //通过动态生成子类的方式创建代理类
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeTopic(1000);
        forumService.removeForum(1026);
    }
}
