package com.company.WzorceProjektowe.DecoratorPizza;

public class MushroomDecorator extends BasicPizzaDecorator {

    public MushroomDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        System.out.println("Mushroom price: 10");
        return super.getPrice() + 10;
    }
}
