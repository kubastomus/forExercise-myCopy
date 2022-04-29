package com.company.ZaawJavaSDA.ZaawThreadZad1;

public class Main {
    public static void main(String[] args) {

        Thread myThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++){
                    if (i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
            }
        });

        Thread myThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 14300; i < 17800; i++){
                    if (i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }

            }
        });

        myThread1.run();
        myThread2.run();
    }
}