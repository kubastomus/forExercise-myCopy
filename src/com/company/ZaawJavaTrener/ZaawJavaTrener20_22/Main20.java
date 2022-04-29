package com.company.ZaawJavaTrener.ZaawJavaTrener20_22;

import java.util.List;

public class Main20 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3,2);
        Triangle triangle = new Triangle(5);
        Hexagon hexagon = new Hexagon(4);

        List<Shape> shapes = List.of(rectangle, triangle, hexagon);

        double totalArea = shapes.stream().mapToDouble(Shape::getArea).sum();
        System.out.println(totalArea);

        Cube cube = new Cube(10);
        cube.fill(20);
        cube.fill(980);
        cube.fill(30);



    }
}
