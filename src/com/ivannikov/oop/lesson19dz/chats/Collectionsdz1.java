package com.ivannikov.oop.lesson19dz.chats;

import java.util.*;

public class Collectionsdz1 {

    public static void main(String[] args) {

        List<Chat> chats = getChatsList();

        chats.removeIf(chat -> chat.getNumberOfUsers() < 1000);
        chats.sort(Comparator.comparing(Chat::getNumberOfUsers).thenComparing(Chat::getChatName));
        chats.sort(Comparator.comparing(Chat::getChatName));
        Collections.sort(chats);

        chats.forEach(System.out::println);
    }

    private static List<Chat> getChatsList() {
        String chatName = "Chat_Name_";
        Random random = new Random();
        List<Chat> chats = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            chats.add(new Chat(chatName + i, random.nextInt(0, 1050)));
        }
        return chats;
    }


//    public static void main(String[] args) {
//        Map<String, Integer> chats = getAllChats();
//        chats.values().removeIf(integer -> integer < 1000);
//
//
//
//        print(chats);
//    }
//
//    private static void print(Map<String, Integer> chats) {
//        for (Map.Entry<String, Integer> entry : chats.entrySet()) {
//            System.out.println(entry.getKey() + " == " + entry.getValue());
//        }
//    }
//
//    private static Map<String, Integer> getAllChats() {
//        String chatName = "Chat_Name_";
//        Random random = new Random();
//        Map<String, Integer> chats = new HashMap<>();
//
//        for (int i = 0; i < 1000; i++) {
//            chats.put(chatName + i, random.nextInt(500, 1500));
//        }
//        return chats;
//    }
}
