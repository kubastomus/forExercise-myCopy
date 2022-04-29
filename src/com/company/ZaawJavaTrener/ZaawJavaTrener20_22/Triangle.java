package com.company.ZaawJavaTrener.ZaawJavaTrener20_22;

public class Triangle extends Shape {

    private int a;

    public Triangle(int a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 3 * a;
    }

    @Override
    public double getArea() {
        return a * a * Math.sqrt(3) / 4;
    }
}
