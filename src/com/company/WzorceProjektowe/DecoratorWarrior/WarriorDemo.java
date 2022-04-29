package com.company.WzorceProjektowe.DecoratorWarrior;

public class WarriorDemo {
    public static void main(String[] args) {

     IWarrior warrior = new Warrior(40);
        System.out.println("Moc warrior " + warrior.getPower());

        warrior = new RamboDecorator(warrior);
        System.out.println("Moc warrior udekorowanego Rambo " + warrior.getPower());

        warrior = new TerminatorDecorator(warrior);
        System.out.println("Moc warrior udekorowanego Terminator " + warrior.getPower());



//        IWarrior otherWarrior = new RamboDecarator(new TerminatorDecorator(new Warrior(23)));    //coś nie poszło


    }
}
