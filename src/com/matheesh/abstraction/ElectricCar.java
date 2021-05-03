package com.matheesh.abstraction;

public class ElectricCar extends Car{

    public ElectricCar(String name){
        super(name);
    }

    public void engine(){
        motor();
    }

    public void motor(){
        System.out.println("It runs on 100 bhp Motor");
    }
}
