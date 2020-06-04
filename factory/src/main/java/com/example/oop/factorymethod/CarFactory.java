package com.example.oop.factorymethod;

public class CarFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        System.out.println("Creating Car");
        return new Car();
    }
}
