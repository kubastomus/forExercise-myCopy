package com.company.Examples.IterationMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // WYKORZYSTUJĄC KeySet:
        // stworzenie mapy przy użyciu statystyczne metody kreacyjnej
        Map<Integer, String> exampleMap1 = Map.of(1, "1value", 2, "2value", 3, "3value");

        Set<Integer> keySet = exampleMap1.keySet();
        for (Integer key: keySet){
            System.out.println("Key: " + key + ", value: " + exampleMap1.get(key));
        }

        System.out.println("------------------");

        // WYKORZYSTUJĄC EntrySet:
        // stworzenie mapy przy użyciu statystyczne metody kreacyjnej
        Map<Integer, String> exampleMap2 = Map.of(1, "11", 2, "22", 3, "33");
        Set<Map.Entry<Integer, String>> entrySet = exampleMap2.entrySet();
        for (Map.Entry<Integer, String> entry: entrySet){
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        System.out.println("--------------------");

        // PRZY UŻYCIU WYRAŻENIA LAMBDA:
        // stworzenie mapy przy użyciu statystyczne metody kreacyjnej
        Map<Integer, String> exampleMap3 = Map.of(1, "1111", 2, "2222", 3, "3333");

        exampleMap3.forEach((keyName, valueName) -> System.out.println("Key: " + keyName + ", value: " + valueName));

        System.out.println("______Inne podrecznikowe przykłady________");


        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("Tomek", "Monika");
        sampleMap.put("Filip", "Marta");

        System.out.println("Iterowanie po wartościach");
        for (String value: sampleMap.values()){
            System.out.println(value);
        }

        System.out.println("Iterowanie po kluczach i pobieranie wartości");
        for (String key: sampleMap.keySet()){
            String value = sampleMap.get(key);
            System.out.println(key + " + " + value);
        }

        System.out.println("Iterowanie po kluczach i wartościach");
        for(Map.Entry<String, String> entry: sampleMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " >>> " + value);
        }

        System.out.println("Mój przykład z forEach");
        sampleMap.forEach((k, v) -> System.out.println(k + " +++ " + v));

    }
}
