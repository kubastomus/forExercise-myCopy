package com.company.WzorceProjektowe.DecoratorCar;

public class LuxuryCarDecorator extends BasicDecorator {

    public LuxuryCarDecorator(ICar basicCar) {
        super(basicCar);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Check aircondition");
    }
}
