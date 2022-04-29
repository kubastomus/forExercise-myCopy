package com.company.WzorceProjektowe.BuilderCar;

public class BuilderCarMain {
    public static void main(String[] args) {

        Car myCar = new Car.Builder()
                .owner("Tomek")
                .isElectric(true)
                .build();


        System.out.println(myCar.getOwner());
        System.out.println(myCar.isElectric());

        System.out.println(myCar.getEngine()); // nie zdefiniowany więc null




    }
}
