package com.ivannikov.oop.lesson10;

import java.util.Arrays;

public class Task10dz {
    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] numbers = getNumbers(str);
        System.out.println(Arrays.toString(numbers));
        int sum = sum(numbers);
        System.out.println(sum);
    }
    public static int sum(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }
    public static int[] getNumbers(String str){
        int count = 0;
        int[] result;
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if(Character.isDigit(aChar)) {
                count++;
            }
        }
        int counter = 0;
        result = new int[count];

        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                String s = String.valueOf(aChar);
                result[counter] = Integer.parseInt(s);
                counter++;
            }
        }
        return result;
    }
}
