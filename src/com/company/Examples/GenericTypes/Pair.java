package com.company.Examples.GenericTypes;

public class Pair<T, V> {

    private T value1;
    private V value2;

    public Pair(T value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}
