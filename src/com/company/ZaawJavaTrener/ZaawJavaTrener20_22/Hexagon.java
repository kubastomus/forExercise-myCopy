package com.company.ZaawJavaTrener.ZaawJavaTrener20_22;

public class Hexagon extends Shape {

    private int a;

    public Hexagon(int a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 6 * a;
    }

    @Override
    public double getArea() {
        return 3 * a * a * Math.sqrt(3) / 2;
    }
}
