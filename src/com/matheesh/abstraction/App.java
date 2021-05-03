package com.matheesh.abstraction;

public class App {

    public static void main(String[] args){

        ElectricCar ev = new ElectricCar("Tesla");
        GasCar gv = new GasCar("Audi");

        gv.engine();
        gv.fuelType();
        ev.engine();
        ev.getTyreType();
    }
}
