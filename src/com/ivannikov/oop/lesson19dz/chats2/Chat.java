package com.ivannikov.oop.lesson19dz.chats;

public class Chat implements Comparable<Chat>{
    private String chatName;
    private Integer numberOfUsers;

    public Chat(String chatName, Integer numberOfUsers) {
        this.chatName = chatName;
        this.numberOfUsers = numberOfUsers;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public Integer getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(Integer numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }



    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", numberOfUsers=" + numberOfUsers +
                '}';
    }

    @Override
    public int compareTo(Chat o) {

        return String.CASE_INSENSITIVE_ORDER.compare(chatName, o.getChatName());
    }
}
