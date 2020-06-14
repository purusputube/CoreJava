package com.purustech.learning.generics;

public class GenericsMethodExample {

	//Java Generic Method
	public <T extends Number> boolean isEqual(T p1, T p2){
		return (p1.equals(p2)); // equals is a method which compares the content of the object
	}
	/* public boolean isEqual(Integer i, Integer i1){
		System.out.println("in non generic method");
		return i.equals(i1);
	}

	public boolean isEqual(Double i, Double i1){
		System.out.println("in non generic method of double values");
		return i.equals(i1);
	}*/


	public static void main(String args[]){
		GenericsMethodExample genericsMethodExample = new GenericsMethodExample();

		Boolean isIntegerParamsEqual = genericsMethodExample.isEqual(2,2);

		// because of type inference the compiler know which Object to apply in generic method

		Boolean isDoubleParamsEqual = genericsMethodExample.isEqual(2.4, 5.7);
		// Boolean isStringParamsEqual = genericsMethodExample.isEqual("Hello", "Hello");
		System.out.println("is integer params are equal ? " + isIntegerParamsEqual);
		System.out.println("is double params are equal ? " + isDoubleParamsEqual);
		// System.out.println("is string parames are equal ? " + isStringParamsEqual);

	}
}
