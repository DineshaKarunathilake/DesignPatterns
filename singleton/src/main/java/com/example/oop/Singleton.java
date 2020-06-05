package com.example.oop;

public class Singleton {

    private volatile static Singleton uniqueInstance;
    //volatile keyword makes sure that multiple threads handles the uniqueInstance properly

    private Singleton(){}       //private constructor

    public static Singleton getInstance() {
        if (uniqueInstance == null) {               //To synchronize in the first time only
            synchronized (Singleton.class) {        //synchronizing holds back performance so better to do it first time only
                if (uniqueInstance == null) uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }


}
