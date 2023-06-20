package com.netwerkapp.game;

public class User {
    private final String username;
    private int answerLength;

    public User(String username) {
        this.username = username;
        this.answerLength = -1;
    }

    public String getUsername() {
        return username;
    }

    public int getAnswerLength() {
        return answerLength;
    }
}
