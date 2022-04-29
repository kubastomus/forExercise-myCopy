package com.company.Examples.ListSortingPerson;

import java.util.*;
import java.util.function.Consumer;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//
//        list.add("W");
//        list.add("D");
//        list.add("T");
//        list.add("A");
//
//        Collections.sort(list);
//
//        for (String s : list){
//            System.out.println(s);
//        }

        List<Person> people = new ArrayList<>();

        people.add(new Person("Tomasz","Kowalski",21));
        people.add(new Person("Adolf","Niemiec", 58));
        people.add(new Person("Adam", "Małysz", 54));
        people.add(new Person("Kuba","Rozpruwacz", 45));

        Collections.sort(people);

        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        Comparator<Person> personComparator1 = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        Collections.sort(people,(p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        Consumer<Person> personConsumer = p -> System.out.println(p);
        people.forEach(p -> System.out.println(p));

        System.out.println("------------------------1");

        for (Person person: people){
            System.out.println(person);
        }

        System.out.println("------------------------2");

        Comparator<Person> comparatorP = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };

        Collections.sort(people, comparatorP);

        for (Person s: people){
            System.out.println(s);
        }


    }
}
