package com.example.oop;

import com.example.oop.component.Run;
import com.example.oop.component.Workout;
import com.example.oop.decorator.PushUp;
import com.example.oop.decorator.Weights;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Workout workout = new Run();
        workout = new Weights(workout);
        workout = new PushUp(workout);

        System.out.println(workout.getDescription() + " burnt a total of " + workout.burntCalories() + " calories ");
    }
}
