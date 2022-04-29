package com.company.WzorceProjektowe.DecoratorCar;

public class DecoratorDemo {
    public static void main(String[] args) {

//        ICar car1 = new Car();
//        car1.startEngine();

        ICar car2 = new PoliceCarDecorator(new LuxuryCarDecorator(new Car()));
        car2.startEngine();

    }
}
