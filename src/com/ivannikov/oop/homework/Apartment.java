package com.ivannikov.oop.homework;

import java.util.Arrays;

public class Apartment {
    private int number;
    private Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    void print() {
        System.out.println("Number apartment " + number + ", number of rooms " + rooms.length);
    }
    public Room getRoom() {
        return Arrays.stream(rooms).findAny().get();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
