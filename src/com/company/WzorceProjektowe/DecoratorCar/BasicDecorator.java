package com.company.WzorceProjektowe.DecoratorCar;

public class BasicDecorator implements ICar {

    private ICar basicCar;

    public BasicDecorator(ICar basicCar) {
        this.basicCar = basicCar;
    }

    @Override
    public void startEngine() {
        basicCar.startEngine();
    }
}
