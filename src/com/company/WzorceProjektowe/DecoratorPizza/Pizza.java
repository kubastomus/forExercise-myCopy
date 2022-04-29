package com.company.WzorceProjektowe.DecoratorPizza;

public class Pizza implements IPizza {

    private int price;

    public Pizza(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

