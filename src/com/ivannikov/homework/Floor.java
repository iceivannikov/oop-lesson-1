package com.ivannikov.homework;

import java.util.Arrays;

public class Floor {
    private int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    void print() {
        System.out.println("Number floor " + number + ", numbers of apartments " + apartments.length);
    }

    public Apartment getApartment() {
        return Arrays.stream(apartments).findFirst().get();
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }
}
