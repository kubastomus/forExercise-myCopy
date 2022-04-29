package com.company.Examples.MultithreadingJoin;

public class AnotherThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "::::>> ");
        System.out.println("Hello from another Thread");
    }
}
