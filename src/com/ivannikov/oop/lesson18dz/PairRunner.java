package com.ivannikov.oop.lesson18dz;

public class PairRunner {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Viktor", 38);
        System.out.println(pair);

        Pair<Integer, String> swap = PairUtil.swap(pair);
        System.out.println(swap);
    }
}
