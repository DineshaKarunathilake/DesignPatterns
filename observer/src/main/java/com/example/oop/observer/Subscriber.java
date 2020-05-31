package com.example.oop.observer;

public interface Subscriber {

     default void update(String profileName, String tweet) {
        System.out.println( profileName + " just tweeted " + "\'" + tweet +"\'");
    }

}
