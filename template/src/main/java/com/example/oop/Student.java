package com.example.oop;

public class Student extends Person {
    String name, id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    boolean isValid() {
        return name != null && id != null;
    }

    @Override
    void saveToDB() {
        System.out.println("Saving Student to Students DB :: " + name);

    }

    @Override
    void logSaveAction() {
        System.out.println("Successfully Student to Students DB :: " + name);
    }
}
