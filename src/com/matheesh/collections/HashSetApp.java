package com.matheesh.collections;

import java.util.HashSet;

public class HashSetApp {

    public static void main(String[] args){

        /*
        HashSet doesn't allow duplicate values and also it's unordered
        If you want the elements to be in order use LinkedHashSet intead of HashSet
         */
        HashSet<Integer> set = new HashSet();

        set.add(1);
        set.add(23);
        set.add(23);
        set.add(42);
        set.add(2);
        set.add(11);

        HashSet<String> tables = new HashSet();

        tables.add("cart_view_visit_ly");
        tables.add("category_visit_ly");
        tables.add("checkout_view_visit_ly");



        System.out.println(tables.contains("Category_Visit_ly".toLowerCase()));

//        for(Integer item : set){
//            System.out.println(item);
//        }
//
//        LinkedHashSet<Integer> linkSet = new LinkedHashSet();  // It'll preserve the order of insertion
//
//        linkSet.add(1);
//        linkSet.add(23);
//        linkSet.add(23);
//        linkSet.add(42);
//        linkSet.add(2);
//        linkSet.add(11);
//
//        System.out.println();
//        for(Integer item : linkSet){
//            System.out.println(item);
//        }
//
//        /*
//        hashCode() and equals()
//        HashSet functions on the basis of hashCode
//         */
//
//        HashSet<Animal> animal = new HashSet<>();
//
//        System.out.println();
//        animal.add(new Animal("Tiger"));
//        animal.add(new Animal("Tiger"));
//        animal.add(new Animal("Lion"));
//
//        for(Animal item : animal){
//            System.out.println(item);
//        }

    }
}


