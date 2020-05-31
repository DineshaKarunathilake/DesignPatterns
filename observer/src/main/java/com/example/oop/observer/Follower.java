package com.example.oop.observer;

public class Follower implements Subscriber {

    private String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void update(String profileName, String tweet) {

        System.out.println(name + ": "+profileName + " just tweeted " + "\'" + tweet +"\'");

    }
}
