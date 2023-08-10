package com.ivannikov.oop.lesson20.task2;

import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private Integer yearOfIssue;
    private String color;
    private Double power;
    private Integer maxSpeed;

    public Car(String brand, String model, Integer yearOfIssue, String color, Double power, Integer maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.power = power;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(yearOfIssue, car.yearOfIssue) && Objects.equals(color, car.color) && Objects.equals(power, car.power) && Objects.equals(maxSpeed, car.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfIssue, color, power, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
