package com.larry.base.withoutproxy;

/**
 * Created by larry on 15-8-25.
 *
 */
public class ForumServiceTest {

    public static void main(String[] args) {
        ForumService forumService = new ForumServiceImpl();
        forumService.removeTopic(1000);
        forumService.removeForum(1024);
    }
}