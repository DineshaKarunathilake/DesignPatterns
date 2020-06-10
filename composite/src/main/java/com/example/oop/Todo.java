package com.example.oop;

import java.util.ArrayList;
import java.util.Iterator;

public class Todo extends Task {

    ArrayList subTasks = new ArrayList();
    String title;
    String description;

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public void add(Task subTask) {
        subTasks.add(subTask);
    }

    @Override
    public void remove(Task subTask) {
        subTasks.remove(subTask);
    }

//    @Override
//    public Task getChild(int i) {
//        return (SubTodo) subTasks.get(i);
//    }

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
        System.out.println("---------------------------");

        Iterator iterator = subTasks.iterator();
        while (iterator.hasNext()) {
            Task subTodo = (Task) iterator.next();
            subTodo.print();
        }

    }
}
