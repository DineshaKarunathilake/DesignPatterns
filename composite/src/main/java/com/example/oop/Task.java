package com.example.oop;

public abstract class Task {

    public void add(Task task) {
        throw new UnsupportedOperationException();
    }

    public void remove(Task task) {
        throw new UnsupportedOperationException();
    }

//    public Task getChild(int i) {
//        throw new UnsupportedOperationException();
//    }

    public String getTitle() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
