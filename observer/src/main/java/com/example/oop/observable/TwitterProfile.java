package com.example.oop.observable;

import com.example.oop.observer.Subscriber;

interface TwitterProfile {

    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String tweet);

}
