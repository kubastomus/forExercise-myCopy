package com.company.ZaawJavaSDA.ZaawOppZad2;

public class Student extends Person {

    private String typeOfStudies;
    private int yearOfStudies;
    private float costOfStudies;


    public Student(String name, String address, String typeOfStudies, int yearOfStudies, float costOfStudies) {
        super(name, address);
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudies = yearOfStudies;
        this.costOfStudies = costOfStudies;
    }

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public float getCostOfStudies() {
        return costOfStudies;
    }

    public void setCostOfStudies(float costOfStudies) {
        this.costOfStudies = costOfStudies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfStudies='" + typeOfStudies + '\'' +
                ", yearOfStudies=" + yearOfStudies +
                ", costOfStudies=" + costOfStudies +
                '}';
    }
}
