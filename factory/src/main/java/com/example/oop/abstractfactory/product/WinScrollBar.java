package com.example.oop.abstractfactory.product;

public class WinScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("scrolling windows button");
    }
}
