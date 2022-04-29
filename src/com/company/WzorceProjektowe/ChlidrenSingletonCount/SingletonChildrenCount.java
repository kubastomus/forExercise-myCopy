package com.company.WzorceProjektowe.ChlidrenSingletonCount;

public class SingletonChildrenCount {

    private static SingletonChildrenCount instance = new SingletonChildrenCount();

    private int counter = 0;

    //konstruktor prywatny, aby nie mozna bylo stworzyc instancji klasy poza klasa SingletonExmaple
    private SingletonChildrenCount() {
    }

    public static SingletonChildrenCount getInstance() {
        return instance;
    }

    public void count() {
        counter++;
    }

    public int getNumberOfInstances() {
        return counter;
    }

}

