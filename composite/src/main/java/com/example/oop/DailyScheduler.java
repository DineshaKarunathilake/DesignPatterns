package com.example.oop;

public class DailyScheduler {

    Task allTasks;

    public DailyScheduler(Task allTasks) {
        this.allTasks = allTasks;
    }

    public void printAllTasks() {
        allTasks.print();
    }
}
