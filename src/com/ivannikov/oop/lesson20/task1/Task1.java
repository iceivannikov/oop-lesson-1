package com.ivannikov.oop.lesson20.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class Task1 {
    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String text = "doesn't work for hibernate lazy proxy proxy";
        System.out.println(frequencyOfOccurrence(text));

    }

    public static Map<String, Integer> frequencyOfOccurrence(String str) {
        HashMap<String, Integer> result = new HashMap<>();
        String[] strings = str
                .replace(".", EMPTY)
                .replace(",", EMPTY)
                .replace("!", EMPTY)
                .split(SPACE);
        for (String string : strings) {
            Integer oldCount = result.get(string);
            Integer newCount = oldCount == null ? 1 : oldCount + 1;
            result.put(string, newCount);
        }

        return result;
    }
}
