package com.matheesh.abstraction;

public class GasCar extends Car implements Type{

    public GasCar(String name){
        super(name);
    }

    public void engine(){
        System.out.println("It runs on v8 engine");
    }

    public void fuelType(){
        System.out.println("Gas");
    }
}
