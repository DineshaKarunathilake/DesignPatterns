package com.example.oop.abstractfactory.product;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows clicked");
    }
}
