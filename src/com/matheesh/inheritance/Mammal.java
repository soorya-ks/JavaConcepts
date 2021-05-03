package com.matheesh.inheritance;

public class Mammal extends Animal {

    String name = "";
    public Mammal(String name){
        super(name);
        this.name = name;
    }

    public String swim(){
        return name + " is swimming";
    }

}
