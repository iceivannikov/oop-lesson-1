package com.ivannikov.oop.lesson10;

public class Task9dz {
    public static void main(String[] args) {
        String str = "abc Cpddd Dio OsfWw";
        System.out.println(distinct(str));
    }

    public static String distinct(String str) {
        String replace = str.replace(" ", "").toUpperCase();
        return replace
                .chars()
                .distinct()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
