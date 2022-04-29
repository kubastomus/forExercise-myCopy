package com.company.WzorceProjektowe.DecoratorPizza;

public class MozzarellaDecorator extends BasicPizzaDecorator {

    public MozzarellaDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        System.out.println("Mozzarella price: 15");
        return super.getPrice() + 15;
    }
}
