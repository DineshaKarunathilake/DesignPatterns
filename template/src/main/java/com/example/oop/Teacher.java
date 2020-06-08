package com.example.oop;

public class Teacher extends Person {

    String name, id;

    public Teacher(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    boolean isValid() {
        return !id.isEmpty();
    }

    @Override
    void saveToDB() {
        System.out.println("Saving Teacher to Teacher DB :: " + name);

    }

    @Override
    void logSaveAction() {
        System.out.println("Successfully Teacher to DB :: " + name);
    }
}
