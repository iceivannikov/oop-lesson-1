package com.ivannikov.oop.lesson19dz;

import java.util.*;

public class StudentExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Viktor", "Ivannikov", 38, 9.9),
                new Student("Ivan", "Ivanov", 18, 7.9),
                new Student("Petr", "Petrov", 35, 5.9),
                new Student("Kostya", "Semenov", 36, 4.9),
                new Student("Pavel", "Molodsov", 38, 8.9)
        );
        Student student = getBestStudent(students);

        System.out.println(student);
        System.out.println("-".repeat(30));

        students.sort(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName));
        students.forEach(System.out::println);
        System.out.println("-".repeat(30));

        students.sort(Comparator.comparing(Student::getAge));
        students.forEach(System.out::println);
        System.out.println("-".repeat(30));

        students.sort(Comparator.comparing(Student::getAverageMark));
        students.forEach(System.out::println);
        System.out.println("-".repeat(30));
    }

    private static Student getBestStudent(List<Student> students) {
        Student bestStudent = null;
        for (Student student : students) {
            if (Objects.isNull(bestStudent) || bestStudent.getAverageMark() < student.getAverageMark()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
