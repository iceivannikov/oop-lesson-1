package com.ivannikov.oop.lesson19dz;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionExample {

    private static final String TARGET_VALUE = "****";
    private static final int TARGET_LENGTH = 4;

    public static void main(String[] args) {

        List<String> list = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));

        markLength4(list);
        System.out.println(list);
    }

    private static void markLength4(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String nextValue = listIterator.next();
            if (nextValue.length() == TARGET_LENGTH) {
                listIterator.set(TARGET_VALUE);
                listIterator.add(nextValue);
            }
        }
    }
}
