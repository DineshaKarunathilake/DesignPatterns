package com.example.oop;

public abstract class ATMState {

    void insertCard() {
        System.out.println("Operation not permitted in this state");
    }

    void ejectCard() {
        System.out.println("Operation not permitted in this state");
    }

    void enterPin() {
        System.out.println("Operation not permitted in this state");
    }

    void withdrawMoney() {
        System.out.println("Operation not permitted in this state");
    }


}
