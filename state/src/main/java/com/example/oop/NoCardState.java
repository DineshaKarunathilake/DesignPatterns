package com.example.oop;

public class NoCardState extends ATMState {

    ATMMachine machine;

    public NoCardState(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    void insertCard() {
        System.out.println("Card inserted");
        machine.setCurrentState(machine.getHasCardState());
    }

    @Override
    void withdrawMoney() {
        System.out.println("You cannot withdraw money since there is no card inserted");
    }
}
