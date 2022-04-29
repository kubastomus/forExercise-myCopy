package com.company.Examples.GenericBykowski;

import java.util.List;

public class Merchant extends Mariner {

    public Merchant(String name, String surname) {
        super(name, surname);
    }

    public double trande(List<? extends Number> doubles){

        double sum = 0;
        for (Number aDouble : doubles) {
            sum += aDouble.doubleValue();
        }
        return sum;
    }
}
