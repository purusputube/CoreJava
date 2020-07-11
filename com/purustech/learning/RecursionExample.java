package com.purustech.learning;

public class RecursionExample {

    // prints the factorial of a number
    // factorial 5 = 5 * 4 * 3 * 2 *1;
    private static Integer getFactorial(Integer n){
        if(n <= 1){
            return 1;
        }
        return n * getFactorial(n-1);
    }

    public static void main(String[] args) {
        Integer inputNumber = 5;
        Integer factorial = getFactorial(inputNumber);
        System.out.println("Factorial of " + inputNumber + ": " + factorial);
    }
}
