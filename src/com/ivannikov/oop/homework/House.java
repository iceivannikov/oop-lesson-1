package com.ivannikov.homework;

import java.util.Arrays;

public class House {
    private int number;
    private Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    void print() {
        System.out.println("Number house " + number + ", numbers of floors " + floors.length);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }
    public Floor getFloor() {
        return Arrays.stream(floors).findFirst().get();
    }
}
