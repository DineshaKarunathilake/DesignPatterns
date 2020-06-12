package com.example.oop;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        atmMachine.enterPin();
        atmMachine.withdrawMoney();
        atmMachine.ejectCard();
    }
}
