package com.company.Examples.RaceCondition_Synchronized;

public class Counter {

    private int value = 1;

    // Thread-0 odczytał wartość 1
    // Thread-1 odczytał wartość 1
    // Thread-0 przypisał do zmiennej value wartość 2
    // Thread-1 znowu przypisał do zmiennej value wartość 2

    // Thread-1 odczytał wartość 2
    // THread-1 zmniejszyl przypisał wartość 1 do value
    // Thread-2 odczytał wartość 1


    public synchronized void up() {         // bez synchronized losowe wartości value wątków
        for (int i = 0; i < 10000; i++) {
            value++;
            value--;
        }
        value++;
    }

    public synchronized void down() {
        value--;
    }

    public synchronized int getValue() {
        return value;
    }
}
