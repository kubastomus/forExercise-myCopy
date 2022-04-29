package com.company.ZaawJavaTrener.ZaawJavaTrener12_13;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private int productionYear;
    private BigDecimal price;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    public Car(String name,
               String model,
               int productionYear,
               BigDecimal price,
               List<Manufacturer> manufacturers,
               EngineType engineType) {
        this.name = name;
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, productionYear, price, manufacturers, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", price=" + price +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }
}
