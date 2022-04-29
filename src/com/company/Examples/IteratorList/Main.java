package com.company.Examples.IteratorList;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("aa", "bb", "cc", "dd");

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("-----1-----1----1");

        for (String myList: list){
            System.out.println(myList);
        }

        System.out.println("-----2----2----2");

        list.forEach(myList -> System.out.println(myList));

        System.out.println("----3----3----3----3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----iterator----next----excample---");

        for (Iterator<String> iterator1 = list.iterator(); iterator1.hasNext();){
            System.out.println(iterator1.next());
        }


    }
}
