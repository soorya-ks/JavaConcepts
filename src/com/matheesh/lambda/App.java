package com.matheesh.lambda;

public class App {

    public static void main(String[] args){

        /*
        Movable interface is a functional interface
        functional interface should only have one abstract method
        Lambda is a type of functional interface and it can be only assigned to that type
         */
        moveVehicle(() -> System.out.println("Lambda is running"));  // lambda implements Movable interface

        moveVehicle(() -> {
            System.out.println("Lambda with curly braces");
            System.out.println("Lambda with curly braces");
        });

        Movable movableVariable = () -> System.out.println("Lambda assigned to a variable");

        moveVehicle(movableVariable); // Lambda can be assigned to a variable and passed into a method

        moveVehicle(new Jet(){ // We're able to pass anonymous class to moveVehicle(), because it extends Vehicle which implements Movable
            public void move(){
                System.out.println("Custom made vehicle started to move");
            }});

        Jet jet = new Jet(); // don't need to concentrate on this line more(It's just a normal object creation method)
        moveVehicle(jet);

    }

    public static void moveVehicle(Movable movableEntity){
            movableEntity.move();
    }

}
