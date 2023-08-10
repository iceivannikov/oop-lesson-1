package com.ivannikov.oop.lesson10;

import java.util.Objects;

public class Task7dz {
    public static void main(String[] args) {
        String str = "а роза упала на лапу Азора";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String word) {
        String strWithoutSpace = word.replace(" ", "");
        StringBuilder builder = new StringBuilder(strWithoutSpace);
        return Objects.equals(strWithoutSpace.toLowerCase(), builder.reverse().toString().toLowerCase());
    }
}
