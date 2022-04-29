package com.company.ZaawJavaTrener.ZaawJavaTrener20_22;

public class Cone extends Shape3D {

    private int radius;
    private int height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return getArea() * height / 3;
    }
}
