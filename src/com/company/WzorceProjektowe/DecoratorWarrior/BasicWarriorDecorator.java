package com.company.WzorceProjektowe.DecoratorWarrior;

public class BasicWarriorDecorator implements IWarrior {

    private IWarrior warrior;

    public BasicWarriorDecorator(IWarrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public int getPower() {
        return this.warrior.getPower();
        //tu bedziemy dodawali nowe funkcjonalnosci w klasach rozszerzajacych BasicWarriorDecorator
    }
}
