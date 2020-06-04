package com.example.oop.factorymethod;

public class App {

    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory vanFactory = new VanFactory();

        Vehicle car = carFactory.createVehicle();
        Vehicle van = vanFactory.createVehicle();

    }
}
