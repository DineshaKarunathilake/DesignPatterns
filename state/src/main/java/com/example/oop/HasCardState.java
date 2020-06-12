package com.example.oop;

public class HasCardState extends ATMState {

    ATMMachine machine;

    public HasCardState(ATMMachine machine) {
        this.machine = machine;
    }


    @Override
    void ejectCard() {
        System.out.println("card ejected going to no card state");
        machine.setCurrentState(machine.getNoCardState());

    }

    @Override
    void enterPin() {
        System.out.println("PIN entered");
    }

    @Override
    void withdrawMoney() {
        System.out.println("money withdrawn");
    }
}
