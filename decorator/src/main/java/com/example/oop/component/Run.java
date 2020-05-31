package com.example.oop.component;

public class Run implements Workout {

    @Override
    public String getDescription() {
        return "Run";
    }

    @Override
    public Integer burntCalories() {
        return 100;
    }
}
