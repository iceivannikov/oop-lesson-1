package com.ivannikov.oop.lesson10;

public class Task1 {

    public static final String VALUE = "sdsdsd :( kkllklk :( dlskldkslkd :) lskdlkslkd :) kldkiowieowi :(";

    public static void main(String[] args) {
        String result = replace(VALUE);
        System.out.println(result);
    }
    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
