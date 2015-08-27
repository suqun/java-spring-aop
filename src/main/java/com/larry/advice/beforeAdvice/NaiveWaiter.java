package com.larry.advice.beforeAdvice;

/**
 * Created by larry on 15-8-27.
 *
 */
public class NaiveWaiter implements Waiter {
    public void greetTo(String name) {
        System.out.println("Greet to " + name + "...");
    }

    public void serveTo(String name) {
        System.out.println("Serve to " + name + "...");
    }
}
