package com.example.oop;

/**
 * Hello world!
 *
 */
public class RegistrationApp {
    public static void main( String[] args ) {
        Person alice = new Student("Alice", "100");
        alice.save();

        Person bob = new Teacher("Bob", "1");
        bob.save();


    }
}
