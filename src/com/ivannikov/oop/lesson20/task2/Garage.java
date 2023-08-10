package com.ivannikov.oop.lesson20.task2;

import java.util.Map;

public class Garage {
    private Map<Car, Integer> cars;

    public Garage(Map<Car, Integer> cars) {
        this.cars = cars;
    }



    public Map<Car, Integer> getCars() {
        return cars;
    }

    public void setCars(Map<Car, Integer> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}
