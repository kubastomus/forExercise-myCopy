package com.company.ZaawJavaSDA.ZaawGenericZad3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] tab = {1, 45, 32, 5, 9};
        ArrayChangedGen.swap(tab, 0, 4);
        System.out.println(Arrays.toString(tab));
    }
}
