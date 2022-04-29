package com.company.ZaawJavaTrener.ZaawJavaTrener5;

public class Main5 {
    public static void main(String[] args) {

        SdaHashSet<String> mySet = new SdaHashSet<>();

        mySet.add("A");
        mySet.add("A");
        mySet.add("B");
        mySet.add("C");

        System.out.println(mySet.size());
        System.out.println(mySet.contains("A"));

        mySet.remove("A");
        System.out.println(mySet.contains("A"));

        mySet.clear();
        System.out.println(mySet.size());

    }
}
