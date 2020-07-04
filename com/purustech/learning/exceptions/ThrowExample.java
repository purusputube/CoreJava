package com.purustech.learning.exceptions;

public class ThrowExample {
    public static void main(String[] args) {
        Integer[] rollNumbers = {10,11,12,13,14};
        Integer fetchedRollNumber = null;
        try {
            fetchedRollNumber = getArrayElement(rollNumbers,8);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Returned value is " + fetchedRollNumber);
    }

    private static Integer getArrayElement(Integer[] inputArray, Integer indexValue) throws InvalidInputException {
        if(indexValue > (inputArray.length -1 )){
           throw new InvalidInputException("Invlid index provided as an input");
        }
        return inputArray[indexValue];
    }
}
