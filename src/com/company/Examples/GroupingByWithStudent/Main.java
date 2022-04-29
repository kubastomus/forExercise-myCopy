package com.company.Examples.GroupingByWithStudent;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Janek", "Kowal", "2A"),
                new Student("Piotr", "Nowaczyk", "1C"),
                new Student("Kamil", "Dąbrowa", "2A"),
                new Student("Andrzej", "Bober", "2A"),
                new Student("Ewa", "Wiśniewska", "1C")
        );

        Map<String, List<Student>> mapSt = students.stream()
                .collect(Collectors.groupingBy(student -> student.getSchoolClass()));   // grupowanie mapy wg klasyfikacji klas studentów,
                                                                                        // czyli Stringiem jest dana klasa

        List<Student> students2A = mapSt.get("2A");
        students2A.forEach(System.out::println);        // na podstawie mapy przeniesienie do listy wg odpowiednich klas
        System.out.println("_____________");
        mapSt.get("1C").forEach(System.out::println);


    }
}
