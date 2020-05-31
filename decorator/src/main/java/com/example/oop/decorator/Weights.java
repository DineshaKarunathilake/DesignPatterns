package com.example.oop.decorator;

import com.example.oop.component.Workout;

public class Weights implements AdditionalWorkout {

    Workout baseWorkout;

    public Weights(Workout baseWorkout) {
        this.baseWorkout = baseWorkout;
    }

    @Override
    public String getDescription() {
        return baseWorkout.getDescription() + " and Weights";
    }

    @Override
    public Integer burntCalories() {
        return baseWorkout.burntCalories() + 20;
    }
}
