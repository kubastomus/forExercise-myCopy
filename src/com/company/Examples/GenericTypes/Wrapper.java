package com.company.Examples.GenericTypes;

import java.util.ArrayList;
import java.util.List;

public class Wrapper<T> {

    private List<T> list = new ArrayList<>();

    public void add(T value){
        list.add(value);
    }

    public void displayAll(){
        for (T value: list){
            System.out.println(value);
        }
    }

}
