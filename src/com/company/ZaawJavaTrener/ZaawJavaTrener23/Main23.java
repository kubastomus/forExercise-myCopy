package com.company.ZaawJavaTrener.ZaawJavaTrener23;

public class Main23 {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.addAnimals("Leo", 10);
        zoo.addAnimals("Monkey", 20);
        zoo.addAnimals("Fish", 100);


        System.out.println(zoo.getNumberOfAllAnimals());

        System.out.println(zoo.getAnimalsCount());

        System.out.println(zoo.getAnimalsCountSorted());


    }
}
