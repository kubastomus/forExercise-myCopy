package com.company.Exceptions.GetIntExc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean givenValue = false;          // 2
        int x = 0;

        while (!givenValue) {                // 3
            try {
                System.out.print("Enter value: ");
                x = getInt();                          // 4
                givenValue = true;                     // 5
            } catch (InputMismatchException e) {       // 6
                System.out.println("This is not value!");
            }
        }

        int square = x * x;
        System.out.println("Square value is: " + square);
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}

//    Najpierw dodajemy importowanie typu wyjątku, który będziemy łapać (1).
//    Wyjątek ten nie znajduje się w pakiecie java.lang, lecz java.util,
//    dlatego musimy sami dodać jego import do naszego programu.
//    Następnie definiujemy w metodzie main zmienne wartoscPodana i x (2).
//    Pierwsza będzie wskazywała, czy użytkownik podał już poprawną wartość, czy jeszcze nie.
//    Druga zmienna przechowuje wartość od użytkownika.
//    W pętli while (3) wykonujemy próbę pobrania liczby od użytkownika (4) tak długo,
//    aż nie poda on poprawnej liczby. Jeżeli użytkownik poda poprawną liczbę,
//    to w linii (5) ustawimy wartoscPodana na true, dzięki czemu pętla nie wykona się więcej razy.
//    Jeżeli jednak użytkownik poda np. literę zamiast liczby,
//    to wywołanie metody getInt zakończy się rzuceniem wyjątku InputMismatchException,
//    który obsługujemy w linii (6). W tym przypadku informujemy użytkownika,
//    że podał nieprawidłową liczbę.
//    Instrukcja try..catch się kończy i przechodzimy do kolejnego obiegu pętli – w zależności od tego,
//    jaką wartość podał użytkownik, wykona się ona ponownie lub zakończy działanie.
//
//     Na końcu programu liczymy kwadrat pobranej liczby i wypisujemy wynik.