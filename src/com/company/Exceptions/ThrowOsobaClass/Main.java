package com.company.Exceptions.ThrowOsobaClass;

public class Main {

    public static void main(String[] args) {

        try {
            Osoba o = new Osoba("Jan", "Nowak", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Wystapil blad! " + e.getMessage());
        }

    }
}
