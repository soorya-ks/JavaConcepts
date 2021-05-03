package com.matheesh.inheritance;

public class Bird extends Animal {

    String name = "";
    public Bird(String name){
        super(name);
        this.name = name;
    }

    public String fly(){
        return name+ " is flying";
    }

}
