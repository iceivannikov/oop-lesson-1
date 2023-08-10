package com.ivannikov.oop.lesson19dz;

public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double averageMark;

    public Student(String firstName, String lastName, Integer age, Double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }
}
