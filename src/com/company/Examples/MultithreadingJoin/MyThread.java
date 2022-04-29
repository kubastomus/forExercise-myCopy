package com.company.Examples.MultithreadingJoin;

public class MyThread extends Thread {

    private int waitTime;

    public MyThread(int waitTime) {
        this.waitTime = waitTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(waitTime);
            System.out.println(Thread.currentThread().getName() + ": Hello from MyThread");
        } catch (InterruptedException e){
            e.printStackTrace();

        }


    }
}
