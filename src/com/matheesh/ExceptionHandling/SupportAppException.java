package com.matheesh.ExceptionHandling;

public class SupportAppException {

    public int division(int num1, int num2) throws Exception {
        if(num2 == 0){
            throw new Exception("divisibleByZero");
        }
        return num1/num2;
    }
}
