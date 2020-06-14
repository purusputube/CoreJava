package com.purustech.learning.generics;

public class GenericsExample {
    public static void main(String[] args) {
        GenericNumberHolder<Integer> numberHolder = new GenericNumberHolder();
        numberHolder.setT(10);

        System.out.println("The number set is " + numberHolder.getT());
        Integer additionValue = numberHolder.getT() + 2; // super class is Object, subclass is Integer

        System.out.println("The integer addition value is " + additionValue);
        GenericNumberHolder<Double> doubleNumberHolder = new GenericNumberHolder();
        doubleNumberHolder.setT(20.2);

        Double doubleAdditionValue =doubleNumberHolder.getT() + 2; // super class is Object, subclass is Integer

        System.out.println("The double addition value is " + doubleAdditionValue);


    }
}

// A class which holds a number
class GenericNumberHolder<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

