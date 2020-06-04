package com.example.oop.factorymethod;

public class VanFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        System.out.println("Creating Van");
        return new Van();
    }
}
