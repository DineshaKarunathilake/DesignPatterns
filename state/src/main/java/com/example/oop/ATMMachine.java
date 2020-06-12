package com.example.oop;

public class ATMMachine {

    ATMState noCardState;
    ATMState hasCardState;

    ATMState state;

    public ATMMachine() {
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        this.state = noCardState;
    }

    void insertCard() {
        state.insertCard();
    }

    void ejectCard() {
        state.ejectCard();
    }

    void enterPin() {
        state.enterPin();
    }

    void withdrawMoney() {
        state.withdrawMoney();
    }

    void setCurrentState(ATMState state) {
        this.state = state;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }
}
