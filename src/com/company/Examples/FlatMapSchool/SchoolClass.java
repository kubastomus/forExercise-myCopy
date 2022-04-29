package com.company.Examples.FlatMapSchool;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    private String name;
    private List<Student> students;

    public SchoolClass(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }
}
