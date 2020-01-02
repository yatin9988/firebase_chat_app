package com.example.firebase_chat_app;

public class FriendlyMessage {

    private String text;
    private String author;
    private String photo;

    // non parametrized constructor
    public FriendlyMessage(){

    }

    // parametrized constructor
    public FriendlyMessage(String text,String author,String photo){
        this.text = text;
        this.author = author;
        this.photo = photo;
    }

    // getter methods
    public String getText(){
        return this.text;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getPhoto(){
        return this.photo;
    }

    // setter methods
    public void setText(String text){
        this.text = text;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPhoto(String photo){
        this.photo = photo;
    }

}
