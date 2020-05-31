package com.example.oop.decorator;

import com.example.oop.component.Workout;

public class PushUp implements AdditionalWorkout{

    Workout baseWorkout;

    public PushUp(Workout baseWorkout) {
        this.baseWorkout = baseWorkout;
    }

    @Override
    public String getDescription() {
        return baseWorkout.getDescription() + " and PushUps";
    }

    @Override
    public Integer burntCalories() {
        return baseWorkout.burntCalories() + 10;
    }
}
