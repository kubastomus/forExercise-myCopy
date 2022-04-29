package com.company.ZaawJavaTrener.ZaawJavaTrener6;

import java.util.TreeMap;

public class Main6 {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Java", 17);
        treeMap.put("Python", 3);
        treeMap.put("C++", 15);

        System.out.println(treeMap);

        displayFirstAndLast(treeMap);
    }

    private static void displayFirstAndLast(TreeMap<?, ?> map) {
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());


    }
}
