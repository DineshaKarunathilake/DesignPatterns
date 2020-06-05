package com.example.oop.receiver;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Light "+ name+ "  ON");
    }

    public void off() {
        System.out.println("Light " + name + " OFF");
    }
}
