package com.ivannikov.homework;

public class HomeworkRunner {
    public static void main(String[] args) {
        Room room = new Room();
        Room[] rooms = {room, room, room};
        Apartment apartment = new Apartment(4, rooms);
        Apartment[] apartments = {apartment, apartment, apartment, apartment, apartment};
        Floor floor = new Floor(5, apartments);
        Floor[] floors = {floor, floor, floor, floor, floor};
        House house = new House(5, floors);

        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.print();
        Floor floor = house.getFloor();
        floor.print();
        Apartment apartment = floor.getApartment();
        apartment.print();
        apartment.getRoom().print();
    }
}
