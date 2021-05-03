package com.matheesh.collections;

import java.util.ArrayList;

public class VehicleApp {

    public static void main(String[] args){

        ArrayList<Vehicle> list = new ArrayList();

        list.add(new Vehicle("Tesla", "Roadster", 50000, true));
        list.add(new Vehicle("Audi", "Bloom", 40000, false));
        list.add(new Vehicle("Tata", "Nexon", 20000, true));

        for(Vehicle item : list){
            System.out.println(item);  // overridden toString method; refer Vehicle class for definition
        }
    }


}
