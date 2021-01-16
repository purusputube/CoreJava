package com.purustech.learning.lamda;

public class GreaterThanTenDeterminer implements NumberDeterminer {
    // algorithm or code belongs to method here
    @Override
    public void doOperation(Integer a) {
        System.out.println("Using method approach : printGreaterThan10orNot");
        if (a > 10)
            System.out.println("Greater than 10");
        else
            System.out.println("Less than or equal to 10");
        System.out.println("Using method approach : printGreaterThan10orNot ends");
    }
}
