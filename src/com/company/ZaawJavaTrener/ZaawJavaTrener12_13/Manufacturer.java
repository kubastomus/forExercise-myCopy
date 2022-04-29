package com.company.ZaawJavaTrener.ZaawJavaTrener12_13;

import java.util.Objects;

public class Manufacturer {

    private String name;
    private int startYear;
    private String country;

    public Manufacturer(String name, int startYear, String country) {
        this.name = name;
        this.startYear = startYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer manufacturer = (Manufacturer) o;
        return startYear == manufacturer.startYear
                && Objects.equals(name, manufacturer.name)
                && Objects.equals(country, manufacturer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startYear, country);
    }
}
