package com.matheesh.lambda;

public class AppPractice {

    public static void main(String[] args){

        Calculate sumLambda = (a,b) -> a+b;
        System.out.println(sumLambda.compute(5,10));

        Calculate divideLambda = (a,b) -> {
            if(a==1)
                return 0;
            else
                return a/b;
        };  // lambda should end with semi colon

        System.out.println("divideLambda " + divideLambda.compute(100,5));

        Reversible reverse = (str) -> {
            String myString = "";
            for(int i = str.length()-1; i >= 0; i--){
                myString = myString + str.charAt(i);
            }
            return myString;
        };

        System.out.println("Reversed String " + reverse.reverseString("Matheesh"));

        Convertible<Integer> sum = (a) -> {  // We've used same method for two different functions(check Convertible interface)
            return a;
        };

        System.out.println("Returning input " + sum.testGeneric(5));

        Convertible<String> firstFourLetters = (str) -> {
            System.out.print("Printing first four letters of the input string - ");
            return str.substring(0,4);
        };

        System.out.println(firstFourLetters.testGeneric("Matheesh"));


    }

    public static int sum(int a, int b){
        return a+b;
    }
}

interface Calculate{
     int compute(int a, int b);
}

interface Reversible {
   public String reverseString(String str);
}

interface Convertible<T> {  // It's more dynamic and can be used for multiple types
    public T testGeneric(T type);

}