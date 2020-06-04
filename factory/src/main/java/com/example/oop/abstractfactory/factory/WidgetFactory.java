package com.example.oop.abstractfactory.factory;


import com.example.oop.abstractfactory.product.Button;
import com.example.oop.abstractfactory.product.ScrollBar;

public interface WidgetFactory {

    Button createButton();
    ScrollBar createScrollBar();

}

