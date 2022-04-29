package com.company.ZaawJavaSDA.ZaawGenericZad3;

public class ArrayChangedGen {

    public static <T> void swap(T[] array, int index1, int index2){

        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
