package com.matheesh.inheritance;

public class App {

    public static void main(String[] args){

        Bird animal1 = new Bird("Cuckoo");
        Mammal animal2 = new Mammal("Dog");

        Animal anim1 = new Bird("sparrow");  // We cannot call fly() when it's Animal type
        Animal anim2 = new Mammal("Dog");    // We cannot call swim() when it's Animal type

        System.out.println(animal1.eat());
        System.out.println(animal2.eat());
        System.out.println(animal1.fly());
        System.out.println(animal2.swim());

    }
}
