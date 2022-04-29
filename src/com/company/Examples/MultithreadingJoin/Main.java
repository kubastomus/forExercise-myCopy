package com.company.Examples.MultithreadingJoin;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + ": Hello my world");
        Thread myThreadA = new Thread(new MyThread(300));
        Thread myThreadB = new Thread(new MyThread(1500));
        Thread anotherThread = new Thread(new AnotherThread());

        myThreadA.start();
        anotherThread.start();
        myThreadB.run();        // run i start to to samo
        anotherThread.join();
        myThreadA.join();       // join czeka na zakończenie wątku
        myThreadB.join();

        System.out.println("BYE BYE");

    }
}
