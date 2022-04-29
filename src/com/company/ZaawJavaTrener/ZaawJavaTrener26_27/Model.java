package com.company.ZaawJavaTrener.ZaawJavaTrener26_27;

import java.util.List;

public class Model {

    private String model;
    private int productionStartYear;
    private List<Car> cars;

    public Model(String model, int productionStartYear, List<Car> cars) {
        this.model = model;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionStartYear() {
        return productionStartYear;
    }

    public void setProductionStartYear(int productionStartYear) {
        this.productionStartYear = productionStartYear;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                ", productionStartYear=" + productionStartYear +
                ", cars=" + cars +
                '}';
    }
}
