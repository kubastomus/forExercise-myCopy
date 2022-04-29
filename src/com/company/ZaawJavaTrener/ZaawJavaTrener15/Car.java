package com.company.ZaawJavaTrener.ZaawJavaTrener15;

import java.math.BigDecimal;

public enum Car {
    FERRARI(new BigDecimal(900000),700),
    PORSCHE(new BigDecimal(700000),600),
    MERCEDES(new BigDecimal(400000),300),
    BMW(new BigDecimal(350000), 350),
    OPEL(new BigDecimal(90000),120),
    FIAT(new BigDecimal(50000),80),
    TOYOTA(new BigDecimal(40000),100);

    private BigDecimal price;
    private int power;


    Car(BigDecimal price, int power) {
        this.price = price;
        this.power = power;
    }

    public boolean isPremium(){
        return price.compareTo(BigDecimal.valueOf(200000)) > 0;
    }

    public boolean isRegular(){
        return !isPremium();
    }

    public boolean isFAsterThan(Car car){
        return this.power > car.power;
    }


}