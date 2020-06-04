package com.example.oop.abstractfactory;

import com.example.oop.abstractfactory.factory.OSXWidgetFactory;
import com.example.oop.abstractfactory.factory.WidgetFactory;
import com.example.oop.abstractfactory.factory.WindowsWidgetFactory;

public class GUIGenerator {

    private static WidgetFactory factory(String appearance) {
        switch(appearance) {
            case "osx":
                return new OSXWidgetFactory();
            case "win":
                return new WindowsWidgetFactory();
            default:
                throw new IllegalArgumentException("unknown " + appearance);
        }
    }

    public static void main(final String[] arguments) {

        WidgetFactory factory = factory("osx");

        factory.createButton().click();
        factory.createScrollBar().scroll();
    }
}