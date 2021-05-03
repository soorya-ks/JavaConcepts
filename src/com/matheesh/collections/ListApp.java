package com.matheesh.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ListApp {

    public static void main(String[] args){

        List<Vehicle> list = new ArrayList();

        list.add(new Vehicle("Maruti", "Alto", 5000, false));
        list.add(new Vehicle("Tesla", "Roadster", 50000, true));

        List<Animal> animalList = new LinkedList();

        animalList.add(new Animal("Tiger"));
        animalList.add(new Animal("Lion"));
        animalList.add(new Animal("Zebra"));

        showItems(list);
        showItems(animalList);

        System.out.println("\n");

        printItems(list);
        printItems(animalList);
    }

    public static void showItems(List list){
        for(Object item : list){
            System.out.println(item);
        }
    }

    public static void printItems(List list){
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
