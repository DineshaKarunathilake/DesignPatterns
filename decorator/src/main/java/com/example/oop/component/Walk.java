package com.example.oop.component;

public class Walk implements Workout {
    @Override
    public String getDescription() {
        return "Walk";
    }

    @Override
    public Integer burntCalories() {
        return 50;
    }
}
