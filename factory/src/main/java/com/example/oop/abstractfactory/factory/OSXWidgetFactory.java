package com.example.oop.abstractfactory.factory;

import com.example.oop.abstractfactory.product.*;

public class OSXWidgetFactory implements WidgetFactory {


    @Override
    public Button createButton() {
        return new OSXButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new OSXScrollBar();
    }
}
