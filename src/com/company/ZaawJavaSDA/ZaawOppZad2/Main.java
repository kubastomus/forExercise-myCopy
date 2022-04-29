package com.company.ZaawJavaSDA.ZaawOppZad2;

public class Main {

    public static void main(String[] args) {

        Person student = new Student("Janek", "Area 51", "Civilization", 2, 5000 );
        System.out.println(student);
        Person staff = new Staff("Computer Programming", 5000f);
        System.out.println(staff);

    }
}
