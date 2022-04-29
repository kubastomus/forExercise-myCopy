package com.company.ZaawJavaTrener.ZaawJavaTrener15;

public class Main {
    public static void main(String[] args) {


        System.out.println(Car.FERRARI.isFAsterThan(Car.TOYOTA));
        System.out.println(Car.TOYOTA.isFAsterThan(Car.PORSCHE));

        System.out.println(Car.TOYOTA.isPremium());
        System.out.println(Car.TOYOTA.isRegular());

        int numberOfMercedes = Car.MERCEDES.ordinal();
        System.out.println(numberOfMercedes);





    }
}
