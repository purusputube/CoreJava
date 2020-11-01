package com.purustech.learning.innerclass;

class NestedClassExample {
    private Integer outerClassIntVariable = 2;
    private Double doubleVar = new Double(2.2);
    private static Integer outerClassStaticIntVariable = 9;
    // static nested class

     static class StaticNestedClass {
        public static void printVariable(){
            System.out.println("Now I am inside a static nested class");
            // static nested class can directly refer the outer class static variables
            System.out.println("Outer class static variable is " + outerClassStaticIntVariable);

            // A static nested class, can not refer directly any instance methods or variables
            // System.out.println("Outer class instance variable " + outerClassIntVariable);

            // it can access only through the instance of outer class
            System.out.println("Outer class instance variable is " + new NestedClassExample().outerClassIntVariable);
        }
    }

     class NonStaticNestedClass {
            // static member can not be declared in a non static inner class,
            // since its associated with an instance of outer class
            // private static int intVar = 4;

            private Integer doubleVar = new Integer(3);


            public void printVariable(){
                System.out.println("Now I am inside a inner class method");
                // inner class can access private fields of outer class
                System.out.println("Outer class variable is " + outerClassIntVariable);
                System.out.println("Outer class static variable is " + outerClassStaticIntVariable);

                System.out.println("Double variable is " + doubleVar);
                System.out.println("Outer class double variable is " + NestedClassExample.this.doubleVar);
            }

            public void printVariableLevels(Double doubleVar){
                System.out.println("Passed variable is " + doubleVar);
                // Shadowing of variables
                System.out.println("Instance level inner class variable is " + this.doubleVar);
                System.out.println("Outer level variable is " + NestedClassExample.this.doubleVar);
            }
    }

}