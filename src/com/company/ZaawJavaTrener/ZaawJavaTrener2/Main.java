package com.company.ZaawJavaTrener.ZaawJavaTrener2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {




        List<String> names = new ArrayList<>();
        names.add("Pluto");
        names.add("Miki");
        names.add("donald");
        names.add("shrek");


        List<String> sorted = getDescendingList(names);

        names.forEach(s -> System.out.println(s));  //początkowa lista
        System.out.println("-----------------------");
        sorted.forEach(s -> System.out.println(s)); //posortowana lista
    }

    public static List<String> getDescendingList (List<String> postman){
        return postman.stream().sorted((s1, s2) -> s2.toUpperCase().compareTo(s1.toUpperCase()))
                .sorted((s1, s2) -> s2.compareToIgnoreCase(s1))
                .collect(Collectors.toList());





    }
}
