package com.company.ZaawJavaTrener.ZaawJavaTrener28;

public class Main28 {
    public static void main(String[] args) {

        ExtendedList<Character> extendedList = new ExtendedList<>();
        extendedList.add('a');
        extendedList.add('b');
        extendedList.add('c');
        extendedList.add('d');
        extendedList.add('e');
        extendedList.add('f');
        extendedList.add('g');

        System.out.println(extendedList.getEveryNthElement(1,2));
    }
}
