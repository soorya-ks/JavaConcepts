package com.matheesh.exceptionhandling;

public class App {

    /* Refer FileHandling package for more exception handling(try and catch)*/

    public static void main(String[] args) throws Exception {

        SupportAppException obj = new SupportAppException();
        System.out.println(obj.division(1,0));
    }
}
