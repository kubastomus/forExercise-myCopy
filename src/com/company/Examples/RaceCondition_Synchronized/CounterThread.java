package com.company.Examples.RaceCondition_Synchronized;

public class CounterThread implements Runnable {

    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.up();
            counter.down();
        }
        System.out.print(Thread.currentThread().getName() + ": ");
        System.out.println(counter.getValue());
    }
}
