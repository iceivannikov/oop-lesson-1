package com.ivannikov.oop.lesson10;

public class Task8dz {
    public static void main(String[] args) {
        String value = "CMI";
        int result = convertToArabic(value);
        System.out.println(result);
    }

    public static int convertToArabic(String romanNumber) {
        int prevArabic = getArabic(romanNumber.charAt(romanNumber.length() - 1));
        int result = prevArabic;
        for (int i = romanNumber.length() - 2; i >= 0; i--) {
            int currentArabic = getArabic(romanNumber.charAt(i));
            result += currentArabic < prevArabic ? -currentArabic : currentArabic;
            prevArabic = currentArabic;
        }

        return result;
    }

    /**
     * Здесь представлена реализация нового switch, но можно реализовать и старым способом, логика от этого не изменится.
     *
     * @param romanChar число в римском формате
     * @return число в арабском формате
     */
    public static int getArabic(char romanChar) {
        return switch (romanChar) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
