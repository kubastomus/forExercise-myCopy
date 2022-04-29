package com.company.WzorceProjektowe.DecoratorWarrior;

public class RamboDecorator extends BasicWarriorDecorator {

    public RamboDecorator(IWarrior warrior) {
        super(warrior);
    }

    @Override
    public int getPower() {
        return super.getPower() + 20;
    }
}
