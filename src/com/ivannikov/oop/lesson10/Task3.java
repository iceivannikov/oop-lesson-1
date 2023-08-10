package com.ivannikov.lesson10;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(format("Viktor", "Ivannikov", "Aleksandrovich"));
    }

    private static String format(String firstName, String lastName, String patronymicName) {
//        char firstNameChar = firstName.toUpperCase().charAt(0);
//        char lastNameChar = lastName.toUpperCase().charAt(0);
//        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));
//        return firstNameChar + "." + lastNameChar + "." + patronymicNameChar + ".";
        return String.format("%S.%S.%S.", firstNameChar, lastNameChar, patronymicNameChar);
    }
}
