package com.purustech.learning.lamda;

// This program checks if the number is odd or even / is greater than 10 or not
public class LamdaExample {

    public static void main(String[] args) {
        // NumberDeterminer evenOddDeterminer = new EvenOddDeterminer();
        // NumberDeterminer greaterThanTenDeterminer = new GreaterThanTenDeterminer();
        // runDeterminer(greaterThanTenDeterminer);

        NumberDeterminer evenOddDeterminer = a -> {System.out.println("Using lamda approach : printEvenOrOdd starts");
        if (a % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        System.out.println("Using lamda approach : printEvenOrOdd ends");
        };


        NumberDeterminer greaterThanTenDeterminer = a -> {System.out.println("Using lamda approach: printGreaterThan10orNot starts");
        if (a > 10)
            System.out.println("Greater than 10");
        else
            System.out.println("Less than or equal to 10");
        System.out.println("Using lamda approach  : printGreaterThan10orNot ends");
        };

        runDeterminer(evenOddDeterminer);

        OneLinerLamdaInterface oneLinerOp = () -> {System.out.println("Hello");};
        oneLinerOp.operation();
    }

    private static void runDeterminer(NumberDeterminer numberDeterminer){
        numberDeterminer.doOperation(7);
    }

}
