package com.matheesh.collections;

import java.util.Objects;

public class Animal {

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal1 = (Animal) o;
        return Objects.equals(animal, animal1.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal);
    }

    String animal = "";
    public Animal(String animal){
        this.animal = animal;
    }
}
