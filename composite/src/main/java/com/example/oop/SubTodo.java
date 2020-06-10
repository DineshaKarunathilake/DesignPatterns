package com.example.oop;

public class SubTodo extends Task {

    String title;
    String description;

    public SubTodo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getTitle());
        System.out.println("," + getDescription());

    }
}
