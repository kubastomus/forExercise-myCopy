package com.company.Examples.RaceCondition_Synchronized;

import com.company.Examples.MultithreadingJoin.MyThread;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread = new Thread(new CounterThread(counter));
        Thread thread1 = new Thread(new CounterThread(counter));
        Thread thread2 = new Thread(new CounterThread(counter));
        thread.setName("My name");
        thread.start();
        thread1.start();
        thread2.start();

    }
}
