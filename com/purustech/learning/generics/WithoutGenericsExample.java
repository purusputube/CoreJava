package com.purustech.learning.generics;

public class WithoutGenericsExample {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.setNumber("Hello");

        System.out.println("The number set is " + numberHolder.getNumber());

        Integer additionValue = (Integer)numberHolder.getNumber() + 2; // super class is Object, subclass is Integer

        System.out.println("The integer addition value is " + additionValue);

        NumberHolder doubleNumberHolder = new NumberHolder();
        doubleNumberHolder.setNumber(20.2);

        Double doubleAdditionValue = (Double)doubleNumberHolder.getNumber() + 2; // super class is Object, subclass is Integer

        System.out.println("The double addition value is " + doubleAdditionValue);


    }
}

// A class which holds a number
class NumberHolder {
    Object number;

    public Object getNumber() {
        return number;
    }

    public void setNumber(Object number) {
        this.number = number;
    }
}
