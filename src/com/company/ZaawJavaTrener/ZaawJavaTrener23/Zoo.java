package com.company.ZaawJavaTrener.ZaawJavaTrener23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {

    private Map<String, Integer> mapZoo = new HashMap<>();


    public void addAnimals(String animalName, int number) {
        if (mapZoo.containsKey(animalName)) {
            int newNumber = mapZoo.get(animalName + number);
            mapZoo.put(animalName, newNumber);
        } else {
            mapZoo.put(animalName, number);
        }
    }

    public int getNumberOfAllAnimals() {
//        int sum = 0;
//        for (int value: mapZoo.values()){
//            sum += value;
//        }
//        return sum;

        return mapZoo.values().stream()
                .mapToInt(i -> i.intValue())
                .sum();
    }

    public Map<String, Integer> getAnimalsCount() {
        return new HashMap<>(mapZoo);
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        Map<String, Integer> result = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> sortedEntryList = mapZoo.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toList());

        sortedEntryList.forEach(entry -> result.put(entry.getKey(), entry.getValue()));
        return result;
    }

}
