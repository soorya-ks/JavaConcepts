package com.matheesh.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ComparableApp {

    public static void main(String[] args){

        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee("Matheesh", 50000, "IT"));
        set.add(new Employee("Tom", 40000, "Business"));
        set.add(new Employee("Josh", 45000, "Marketing"));
        set.add(new Employee("Gerald", 30000, "Maintenance"));

        ArrayList<Employee> list = new ArrayList(set);

        /*
        Set doesn't come under List Class, so we need to pass it as a parameter to a list so that we can
        use Collections.sort()

        We cannot use Collections.sort() for Class data type unless  we implement a interface called "Comparable"
        Employee class for more details about Comparable interface
         */

        Collections.sort(list);

        for(Employee item : list)
            System.out.println(item);
    }
}
