package com.matheesh.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListApp {

    public static void main(String[] args){

        /*
        ArrayList is faster when it comes to retrieving data, but slower at manipulating data(elements)
        ArrayList size is initially set to 10 but after that it doubles
        For example, 10-->20-->40-->80-->160
         */
        ArrayList<String> list = new ArrayList<>();  //ArrayList list = new ArrayList() ---> This stores objects3

        list.add("Hello..");
        list.add("This is ");
        list.add("Matheesh!");

        for(String str : list){
            System.out.print(str);
        }
        System.out.println();

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(5);
        intList.add(20);
        System.out.println(intList.size());

        System.out.println(intList.get(0) + intList.get(1));

        /*
        Linked list is faster when it comes to data manipulation, but slower at retrieval
        Refer to linked list data structure for more details
         */

        LinkedList<Double> list2 = new LinkedList();

        list2.add(43.3333);
        list2.add(22.6666);

        System.out.println(list2.peek());
        System.out.print(list2.contains(22.6666));

    }
}
