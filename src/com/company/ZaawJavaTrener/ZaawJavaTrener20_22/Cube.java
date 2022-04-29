package com.company.ZaawJavaTrener.ZaawJavaTrener20_22;

public class Cube extends Shape3D {

    private int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double calculateVolume() {
        return a * a * a;
    }
}
