package com.company.Anagrams;

import java.util.Arrays;

public class AnagramMain {
    public static void main(String[] args) {


        // ewentualnie rozbudowa o spacje

        String a = "MotherInLaw";
        String b = "HitlerWoman";

        System.out.println(a.toLowerCase().charAt(0));

        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        if(a.length() == b.length() && Arrays.equals(arrayA, arrayB) == true){

            System.out.println("Wyrazy są anagramami");
            System.out.println("Wyrazy są równej długosci");

        } else {
            System.out.println("Nie są anagramami");
        }

    }
}
