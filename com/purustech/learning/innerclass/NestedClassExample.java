package com.purustech.learning.innerclass;

class NestedClassExample {
    private Integer outerClassIntVariable = 2;
    private Double doubleVar = new Double(2.2);
    private static Integer outerClassStaticIntVariable = 9;
    // static nested
    static class StaticNestedClass {
        public static void printVariable(){
            System.out.println("Outer class variable is " + outerClassStaticIntVariable);
            System.out.println(new NestedClassExample().outerClassIntVariable);
        }
    }
    // non static nested class, can not have any instance methods or variables
    class InnerClass {
        // public Integer outerClassIntVariable =
        private Double doubleVar = new Double(3.2);
        public void printVariable(){
            System.out.println("Outer class variable is " + outerClassIntVariable);
            System.out.println("Double variable is " + doubleVar);
            System.out.println("Outer class double variable is " + NestedClassExample.this.doubleVar);
        }
        public void printVariableLevels(Double doubleVar){
            System.out.println("Passed variable is " + doubleVar);
            System.out.println("Instance level inner class variable is " + this.doubleVar);
            System.out.println("Outer level variable is " + NestedClassExample.this.doubleVar);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.printVariable();
        // creating instance of the inner class
        NestedClassExample nestedClassExample = new NestedClassExample();
        InnerClass innerClass  = nestedClassExample.new InnerClass();
        innerClass.printVariable();
        innerClass.printVariableLevels(4.5);

    }
}