package com.company.WzorceProjektowe.DecoratorWarrior;

public class Warrior implements IWarrior {

    private int power;

    public Warrior(int power) {
        this.power = power;
    }

    @Override
    public int getPower() {
        return power;
    }
}
