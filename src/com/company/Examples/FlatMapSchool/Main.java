package com.company.Examples.FlatMapSchool;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        SchoolClass schoolClass1C = new SchoolClass("1C");
        schoolClass1C.addStudent(new Student("Piotr", "Nowakowski"));
        schoolClass1C.addStudent(new Student("Jan", "Kowalski"));
        schoolClass1C.addStudent(new Student("Wojciech", "Kowalewski"));

        SchoolClass schoolClass2D = new SchoolClass("2D");
        schoolClass2D.addStudent(new Student("Karol", "Adamczyk"));
        schoolClass2D.addStudent(new Student("Andrzej", "Dąbrowski"));


        List<SchoolClass> school = List.of(schoolClass1C, schoolClass2D);

//        Stream<Student> bothClassStream = school.stream().flatMap(sc -> sc.getStudents().stream());
//        List<Student> students = bothClassStream.collect(Collectors.toList());
//        System.out.println(students);
//        students.stream().map(Student::getLastName).forEach(System.out::println);       // wyświetli nazwiska wszystkich studentów



        Stream<SchoolClass> schoolClassStream = school.stream();
        Stream<String> classNameStream =
                schoolClassStream.map(sc -> sc.getName().toLowerCase());
        classNameStream.forEach(System.out::println);                                 // wyświetli 1c, 2d

        school.stream()
                .map(sc -> sc.getName())
                .forEach(System.out::println);                                        // wyświetli 1C, 2D z dużych liter (niezmienionych) to samo


        school.stream()
                .flatMap(sc -> sc.getStudents().stream())
                .map(student -> student.getLastName())
                .forEach(System.out::println);                                      // wypisuje nazwiska wszystkich studentów

//        List<String> names = List.of("kuba", "Maciek", "Bartek");
//
//        List<String> names2 = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
//
//        System.out.println(names);
//        System.out.println(names2);

    }
}
