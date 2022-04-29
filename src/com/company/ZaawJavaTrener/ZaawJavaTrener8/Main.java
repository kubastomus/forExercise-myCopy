package com.company.ZaawJavaTrener.ZaawJavaTrener8;

public class Main {
    public static void main(String[] args) {

        Parcel smallParcel = new Parcel(30,35, 40, 15, true);
        Parcel medium = new Parcel(40, 45, 50, 30, false);
        Parcel XXL = new Parcel(60, 75, 110, 50, true);
        // Validator validator = new ValidatorImpl();

        System.out.println(smallParcel.validate());
        System.out.println(medium.validate());
        System.out.println(XXL.validate());

    }
}
