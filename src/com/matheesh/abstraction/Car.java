package com.matheesh.abstraction;

public abstract class Car {

    String name = "";
    String tyre = "Tubeless";
    public Car(String name){
        this.name = name;
    }

    public void getTyreType(){
        System.out.print(tyre);
    }
    public abstract void engine();

}
