package com.company.ZaawJavaSDA.ZaawCollectZad3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            values.add(random.nextInt(50));
        }

        Set<Integer> uniqueValue = new HashSet<>();
        Set<Integer> duplicateValue = new HashSet<>();

        for (Integer value: values) {
            System.out.println(value);
            if (!uniqueValue.add(value)){
                duplicateValue.add(value);
            }
        }

        System.out.println("Unique " + uniqueValue);
        System.out.println("Duplicate " + duplicateValue);

    }
}
