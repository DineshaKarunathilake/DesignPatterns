package com.example.oop.observable;

import com.example.oop.observer.Subscriber;

import java.util.ArrayList;

public class BBCTwitter implements TwitterProfile {

    private String profileName;
    private ArrayList<Subscriber> followers;

    public BBCTwitter (String profileName) {
        this.profileName = profileName;
        followers = new ArrayList<>();
    }


    @Override
    public void registerSubscriber(Subscriber subscriber) {
        followers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        followers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String tweet) {
        System.out.println("notifying followers");
        for (Subscriber follower : followers) {
            follower.update(profileName, tweet);
        }
    }

    public void tweet(String tweet)
    {
        System.out.println("\n" + profileName + " has tweeted :: " + tweet + "\n");
        notifySubscribers(tweet);
    }
}
