package com.matheesh.inheritance;

public class Animal {

    String name = "";

    public Animal(String name){
        this.name = name;
    }

    public String walk(){
        return this.name + " is walking";
    }

    public String eat(){
        return this.name + " is eating";

    }
}
