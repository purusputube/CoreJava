package com.purustech.learning.innerclass;

public class SampleInnerClassUsageExample {
    public static void main(String[] args) {
        TwoNumberHolder twoNumberHolder = new TwoNumberHolder(4,6);
        NumberOperation numberOperation = new NumberOperation();
        System.out.println("addition result is " + numberOperation.addNumber(twoNumberHolder));
        System.out.println("subtraction result is " + numberOperation.subtractNumber(twoNumberHolder));
        System.out.println("multiplication result is " + numberOperation.multiplyNumber(twoNumberHolder));
    }
}
