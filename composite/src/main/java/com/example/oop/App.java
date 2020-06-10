package com.example.oop;

public class App {
    public static void main( String[] args ) {

        Task studies = new Todo("Studies", "Study tasks for today");
        Task chores = new Todo("Chores", "Household tasks for today");

        Task allTasks = new Todo("All Tasks", "All tasks for today");

        allTasks.add(studies);
        allTasks.add(chores);

        studies.add(new SubTodo("Iterator Pattern", "Do example code for iterator pattern"));
        studies.add(new SubTodo("Composite Pattern", "Do assignment for composite pattern"));

        chores.add(new SubTodo("Supermarket List", "Buy Soap, Bread"));

        DailyScheduler dailyScheduler = new DailyScheduler(allTasks);

        dailyScheduler.printAllTasks();

    }
}
