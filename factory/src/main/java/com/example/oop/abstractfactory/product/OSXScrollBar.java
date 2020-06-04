package com.example.oop.abstractfactory.product;

public class OSXScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Scrolling OSX scroll bar");
    }
}
