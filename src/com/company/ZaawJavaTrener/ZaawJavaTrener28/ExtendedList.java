package com.company.ZaawJavaTrener.ZaawJavaTrener28;


import java.util.ArrayList;
import java.util.List;

public class ExtendedList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement (int startIndex, int skip) {
        List<T> result = new ArrayList<>();
        for (int i = startIndex; i < super.size(); i += skip + 1){
            result.add(get(i));
        }
        return result;
    }
}
