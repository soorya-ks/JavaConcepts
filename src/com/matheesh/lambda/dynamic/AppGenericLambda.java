package com.matheesh.lambda.dynamic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppGenericLambda {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );
//
//        printCars(cars, new CarCondition() {  // using anonymous class
//            @Override
//            public boolean test(Car c) {
//                return c.getPrice() > 17000 && c.getPrice() < 22500;
//            }
//        });

        System.out.println("Printing cars within the price range...");
        printCars(cars, (c) -> c.getPrice() > 18000 && c.getPrice() < 22500); // same method using lambda

//        printCars(cars, new CarCondition() {
//            @Override
//            public boolean test(Car c) {
//                return c.getColor().equalsIgnoreCase("blue");
//            }
//        });

        System.out.println("Printing cars that are blue in color..");
        printCars(cars, (color) -> color.getColor().equalsIgnoreCase("red")); // same method using lambda

        System.out.println("Printing the Honda cars and their details");
        print(cars, (name) -> name.getName().equalsIgnoreCase("honda") );


        Function<Car, String> myfunction = (c) -> {  // Inbuilt functional interface
            return c.getName() + " " + c.getPrice();
        };

        String myCar = myfunction.apply(cars.get(0));

        System.out.println("Printing car using Function interface - " + myCar);



    }

   /*
   Also checkout Predicate<T> interface in java. Java provides in-built functional interfaces.
    */

    public static void printCars(List<Car> car, CarCondition condition) {

        for (Car c : car)
            if (condition.test(c)) {
                System.out.println(c);
            }
    }

    public static void print(List<Car> list, Predicate<Car> condition) {

        for (Car c : list)
            if (condition.test(c)) {
                System.out.println(c);
            }
    }

}
