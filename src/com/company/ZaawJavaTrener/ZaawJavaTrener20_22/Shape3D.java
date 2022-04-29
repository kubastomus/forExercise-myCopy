package com.company.ZaawJavaTrener.ZaawJavaTrener20_22;

public abstract class Shape3D extends Shape implements Fillable {

    private double stateOfWater;

    public abstract double calculateVolume();

    @Override
    public void fill(int amountOfWater) {

        double volume = calculateVolume();

        if (stateOfWater + amountOfWater > volume) {
            stateOfWater = volume;        // niekoniecznie to potrzebne, nie powinno zmieniać obliczeń
            System.out.println("Za dużo wody");
        } else if (stateOfWater + amountOfWater < volume) {
            stateOfWater += amountOfWater;
            System.out.println("Za mało wody, pozostało: " + (volume - stateOfWater) + "miejsca");
        } else {
            stateOfWater = volume;
            System.out.println("Bryła wypełniona po brzegi. Optymalna ilość wody");
        }

    }
}
