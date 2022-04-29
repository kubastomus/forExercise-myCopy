package com.company.ZaawJavaTrener.ZaawJavaTrener18_19;

import java.util.Objects;

public class Laptop extends Computer {

    private int battery;

    public Laptop(String procesor, String ram, String graphicsCard, String producer, String model, int battery) {
        super(procesor, ram, graphicsCard, producer, model);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery=" + battery +
                '}';
    }
}
