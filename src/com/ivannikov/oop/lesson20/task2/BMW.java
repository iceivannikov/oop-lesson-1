package com.ivannikov.oop.lesson20.task2;

public class BMW extends Car{
    public BMW(String brand, String model, Integer yearOfIssue, String color, Double power, Integer maxSpeed) {
        super(brand, model, yearOfIssue, color, power, maxSpeed);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
