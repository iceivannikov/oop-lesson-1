package com.ivannikov.oop.lesson19dz.chats2;

import java.util.*;

public class CollectionExample2 {
    public static void main(String[] args) {
        List<Chat> chats = getChats();
        List<Person> people = getPeople(chats);
        people.forEach(System.out::println);
//        chats.forEach(System.out::println);
    }

    private static List<Person> getPeople(List<Chat> chats) {
        List<Person> people = new ArrayList<>();
        for (Chat chat : chats) {
            if (chat.getPerson().getAge() > 18) {
                people.add(chat.getPerson());
            }
        }
        return people;
    }

    private static List<Chat> getChats() {
        String chatName = "Chat_Name_";
        String personName = "Person_Name_";
        Random random = new Random();

        List<Chat> chats = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            chats.add(new Chat(chatName + i,
                      new Person(i, personName + i, random.nextInt(10, 40))));
        }
        return chats;
    }
}
