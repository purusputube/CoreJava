package com.purustech.learning.innerclass;

public class UseNestedClass {
    public static void main(String[] args) {
        // Using the static nested class
        NestedClassExample.StaticNestedClass.printVariable();
        // also if you want to create an object of static nested class, you can do like below
        NestedClassExample.StaticNestedClass staticNestedClassInstance= new NestedClassExample.StaticNestedClass();
        System.out.println("Now using the nested static class instance");
        staticNestedClassInstance.printVariable();

        // to instantiate a inner class
        NestedClassExample nestedClassExample = new NestedClassExample();
        NestedClassExample.NonStaticNestedClass innerObject = nestedClassExample.new NonStaticNestedClass();
        innerObject.printVariable();

    }
}
