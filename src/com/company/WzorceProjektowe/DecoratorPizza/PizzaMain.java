package com.company.WzorceProjektowe.DecoratorPizza;

public class PizzaMain {
    public static void main(String[] args) {

        IPizza pizza = new Pizza(20);
        System.out.println("Price pizza only" + pizza.getPrice());

        pizza = new CheeseDecorator(pizza);
        System.out.println("Total price: " + pizza.getPrice());

        pizza = new MozzarellaDecorator(pizza);
        System.out.println("Total price: " + pizza.getPrice());

        pizza = new MushroomDecorator(pizza);
        System.out.println("Total price: " + pizza.getPrice());


    }
}
