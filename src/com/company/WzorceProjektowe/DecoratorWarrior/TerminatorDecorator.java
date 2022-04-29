package com.company.WzorceProjektowe.DecoratorWarrior;

public class TerminatorDecorator extends BasicWarriorDecorator {

    public TerminatorDecorator(IWarrior warrior) {
        super(warrior);
    }

    @Override
    public int getPower() {
        return super.getPower() +40;
    }
}
