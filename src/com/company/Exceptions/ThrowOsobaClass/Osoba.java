package com.company.Exceptions.ThrowOsobaClass;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        if (wiek <= 0) {
            throw new IllegalArgumentException("Wiek nie moze byc ujemny.");
        }
        this.wiek = wiek;
    }
}