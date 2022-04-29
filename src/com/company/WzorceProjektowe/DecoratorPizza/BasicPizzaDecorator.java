package com.company.WzorceProjektowe.DecoratorPizza;

public class BasicPizzaDecorator implements IPizza {

    private IPizza pizza;

    public BasicPizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return this.pizza.getPrice();
    }
}
