package com.example.test_chat_app_two.chatMessageMain;

/**
 * Created by Toddy on 24/02/2018.
 */

class ChatMessage {
    private long id;
    private boolean isMe;
    private String message;
    private Long userId;
    private String dateTime;
    private boolean isDone;
    private char character;


    public boolean isDone() {
        return isDone;
    }
    public void setDone(boolean done) {
        isDone = done;
    }

    public char getCharacter() {
        return character;
    }
    public void setCharacter(char character) {
        this.character = character;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public boolean getIsme() {
        return isMe;
    }
    public void setMe(boolean isMe) {
        this.isMe = isMe;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return dateTime;
    }
    public void setDate(String dateTime) {
        this.dateTime = dateTime;
    }


}
