package com.purustech.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperLowerBoundedWildCardsExample {
    /*
        Upper bound wild card is used for IN parameters and
        Lower bound wild card is used for OUT parameters
        in case the variable used as in and out parameters don't use the wild cards
        In the case where the "in" variable can be accessed using methods defined in the Object class, use an unbounded wildcard.
     */
    // Upper bounded wild card example - For in variable
    public static Double sumOfListValues(List<? extends Number> list) {
        Double sum = 0.0;
        for (Number n : list)
            sum += n.doubleValue();
        return sum;
    }


    // Lower bounded wild card Example - for out variable
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String [] args){
        List<Integer> integerNumbers = new ArrayList<>();
        integerNumbers.add(1);
        integerNumbers.add(2);

        Double intSum = sumOfListValues(integerNumbers);
        System.out.println("Integer summation is " + intSum);


        List<Double> doubleNumbers = new ArrayList<>();
        doubleNumbers.add(4.0);
        doubleNumbers.add(5.0);
        Double duobleSum = sumOfListValues(doubleNumbers);
        sumOfListValues(doubleNumbers);
        System.out.println("Double summation is " + duobleSum);
//
        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);
        System.out.println(integerList.toString());
//
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println(numberList.toString());

    }

}