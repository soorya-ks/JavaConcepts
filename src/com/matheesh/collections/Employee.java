package com.matheesh.collections;

public class Employee implements Comparable<Employee> {

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    String name;
    int salary;
    String department;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    /*
    We need to implement a method called compareTo() and define it.
    We need to tell the method on what basis we need to sort an list which is passed into Collections.sort()
     */

    @Override
    public int compareTo(Employee o) {
        if(this.salary > o.salary)
            return 1;
        else if(this.salary < o.salary)
            return -1;
        else
            return 0;
    }

}
