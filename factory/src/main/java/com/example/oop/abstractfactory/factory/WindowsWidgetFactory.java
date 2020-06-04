package com.example.oop.abstractfactory.factory;

import com.example.oop.abstractfactory.product.Button;
import com.example.oop.abstractfactory.product.ScrollBar;
import com.example.oop.abstractfactory.product.WinButton;
import com.example.oop.abstractfactory.product.WinScrollBar;

public class WindowsWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WinScrollBar();
    }
}
