package com.ivannikov.oop.lesson19dz.chats2;

import java.util.Objects;

public class Chat {
    private String chatName;
    private Person person;

    public Chat(String chatName, Person person) {
        this.chatName = chatName;
        this.person = person;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(chatName, chat.chatName) && Objects.equals(person, chat.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatName, person);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", person=" + person +
                '}';
    }
}
