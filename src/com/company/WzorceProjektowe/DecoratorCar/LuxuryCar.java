package com.company.WzorceProjektowe.DecoratorCar;

public class LuxuryCar extends Car {

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Check aircondition");
    }
}
