package com.example.oop;

import com.example.oop.observable.BBCTwitter;
import com.example.oop.observer.Follower;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        BBCTwitter bbc = new BBCTwitter("BBC Official");

        Follower follower = new Follower("Alice");

        bbc.registerSubscriber(follower);
        bbc.tweet("Expect heavy rains tonight");

        bbc.removeSubscriber(follower);
        bbc.tweet("False Alarm, today's weather will be fine");

    }
}
