package com.company.ZaawJavaTrener.ZaawJavaTrener4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private Map<String, List<String>> map;

    public Storage() {
        this.map = new HashMap<>();
    }

    public void addStorage(String key, String value){
        if (map.containsKey(key)) {
            List<String> list = map.get(key);
            list.add(value);
        } else {
            List<String> valueList = new ArrayList<>();
            valueList.add(value);
            map.put(key, valueList);
        }
    }

    public void displayValues(String key) {
        if (map.containsKey(key)) {
            List<String> valueList = map.get(key);
            valueList.forEach(v -> System.out.println(v));
        }
    }

    public void displayKey(String value) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> valueList = entry.getValue();
            if (valueList.contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
