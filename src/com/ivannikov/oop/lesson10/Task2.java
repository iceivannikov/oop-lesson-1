package com.ivannikov.oop.lesson10;

public class Task2 {
    public static void main(String[] args) {
        String value = "123 jkdjdk lkdlskdl dksldksl 123";
        String word = "123";
        System.out.println(isStartAndEnd(value, word));
    }

    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
