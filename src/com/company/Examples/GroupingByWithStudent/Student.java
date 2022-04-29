package com.company.Examples.GroupingByWithStudent;

public class Student {

    private String firstName;
    private String lastName;
    private String schoolClass;

    public Student(String firstName, String lastName, String schoolClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolClass = schoolClass;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", schoolClass='" + schoolClass + '\'' +
                '}';
    }
}
