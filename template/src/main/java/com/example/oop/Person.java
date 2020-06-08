package com.example.oop;

public abstract class Person {
    private String name;
    private String id;

    public final void save() {
        if (isValid()) saveToDB();
        logSaveAction();

    }

    abstract boolean isValid();
    abstract void saveToDB();
    abstract void logSaveAction();

}
