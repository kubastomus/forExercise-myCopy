package com.company.Examples.GenericTypes;

import java.util.ArrayList;
import java.util.List;

public class ShapeBox <T extends Shape>{

    private List<T> box = new ArrayList<>();

    public void add(T shape) {
        box.add(shape);
    }

    public double getTotalArea() {
        return box.stream()
                .mapToDouble(shape -> shape.getArea())
                .sum();
    }
}
