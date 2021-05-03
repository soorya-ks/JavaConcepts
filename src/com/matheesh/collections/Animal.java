package com.matheesh.collections;

public class Animal {

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                '}';
    }

    String animal = "";
    public Animal(String animal){
        this.animal = animal;
    }
}
