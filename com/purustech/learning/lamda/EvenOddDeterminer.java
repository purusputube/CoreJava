package com.purustech.learning.lamda;

public class EvenOddDeterminer implements NumberDeterminer {

    // algorithm or code belongs to method here
    @Override
    public void doOperation(Integer a){
        System.out.println("Using method approach : printEvenOrOdd");
        if (a%2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        System.out.println("Using method approach : printEvenOrOdd ends");
    }


    public void getResult(NumberDeterminer operation){
        operation.doOperation(6);
    }

}
