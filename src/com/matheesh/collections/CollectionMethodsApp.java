package com.matheesh.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionMethodsApp {

    public static void main(String[] args){

        HashSet<String> set = new HashSet<>();

        set.add("Matheesh");
        set.add("Dharma");
        set.add("Manoj");

        ArrayList<String> list = new ArrayList<>();

        list.add("Nick");
        list.add("Subash");
        list.add("Matheesh");
        list.addAll(set);

        System.out.println("\nlist.addAll(set)");
        for(String item : list)
            System.out.println(item);
        System.out.println();

        list.remove("Matheesh");

        System.out.println("\nlist.remove(\"Matheesh\");");
        for(String item : list)
            System.out.println(item);

        list.retainAll(set);

        System.out.println("\nlist.retainAll(set)");
        for(String item : list)
            System.out.println(item);
        System.out.println();


        list.removeAll(set);

        System.out.println("\nlist.removeAll(set)");
        for(String item : list)
            System.out.println(item);

    }
}

