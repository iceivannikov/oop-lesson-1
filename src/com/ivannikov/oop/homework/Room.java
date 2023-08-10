package com.ivannikov.oop.homework;

import java.util.Random;

public class Room {
    private final boolean checkpoint;

    public boolean isCheckpoint() {
        return checkpoint;
    }

    public Room() {
        Random random = new Random();
        this.checkpoint = random.nextBoolean();
    }

    void print() {
        System.out.println("This room is " + checkpoint);
    }


}
