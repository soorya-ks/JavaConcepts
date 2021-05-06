package com.matheesh.collections;

import java.util.*;

public class HashAndTreeMapApp {

    public static void main(String args[]){

        Map<String, String> rollNo = new HashMap<>();

        rollNo.put("1", "Matheesh");
        rollNo.put("2", "Goku");
        rollNo.put("3", "Naruto");
        rollNo.put("4", "Itachi");
        rollNo.put("five", "Eren");
        rollNo.put("six", "Mikasa");
        rollNo.put("seven", "Tanjirou");
        rollNo.put("eight", "Jiren");

        /*
        TreeMap the data in it based on the keys
        It has rich functionality(methods)
         */

        Map<String, String> rollNoNext = new TreeMap<>();
        rollNoNext.putAll(rollNo);

        /*
        LinkedHashMap preserves the order of insertion
         */

        LinkedHashMap<String, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put("1", "Matheesh");
        linkedMap.put("2", "Goku");
        linkedMap.put("3", "Naruto");
        linkedMap.put("4", "Itachi");
        linkedMap.put("five", "Eren");
        linkedMap.put("six", "Mikasa");
        linkedMap.put("seven", "Tanjirou");
        linkedMap.put("eight", "Jiren");

        for(Map.Entry<String, String> entry : rollNo.entrySet()){
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }

        System.out.println("\n");
        for(Map.Entry<String, String> entry : rollNoNext.entrySet()){
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }
        System.out.println("\n");
        for(Map.Entry<String, String> entry : linkedMap.entrySet()){
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }

    }
}
