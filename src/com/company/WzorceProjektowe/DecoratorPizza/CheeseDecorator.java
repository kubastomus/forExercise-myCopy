package com.company.WzorceProjektowe.DecoratorPizza;

public class CheeseDecorator extends BasicPizzaDecorator {

    public CheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        System.out.println("Cheese price: 12");
        return super.getPrice() + 12;
    }
}
