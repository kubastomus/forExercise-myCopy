package com.company.ZaawJavaTrener.ZaawJavaTrener1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Pluto");
        names.add("Miki");
        names.add("Donald");
        names.add("Shrek");


        List<String> sorted = getDescendingList(names);

        names.forEach(s -> System.out.println(s));  //początkowa lista
        System.out.println("-----------------------");
        sorted.forEach(s -> System.out.println(s)); //posortowana lista
    }

    public static List<String> getDescendingList (List<String> postman){
        return postman.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
//        return postman.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        Collections.sort(postman, (s1, s2) ->s2.compareTo(s1));
//        return postman;
    }
}
