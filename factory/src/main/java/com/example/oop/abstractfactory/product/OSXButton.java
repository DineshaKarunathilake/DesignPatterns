package com.example.oop.abstractfactory.product;

public class OSXButton implements Button {
    @Override
    public void click() {
        System.out.println("OSXButton clicked");
    }
}
