package com.purustech.learning.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchExceptionExample {
    private static Integer getValueByIndexPosition(Integer[] inputArray, Integer indexPosition){
        Integer returnDate = -1;
       //  try{
            System.out.println("inside try block");
            // System.exit(0);
        try {
            returnDate = inputArray[indexPosition];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index received " + indexPosition);
        }
        finally {
            System.out.println("in finally block");
        }
        System.out.println("After the catch block");


        return returnDate;
    }

    private static void readFileContent()  {
        File file = new File("D:\\MyWork\\IntelliJProjects\\SampleProject\\src\\com\\purustech\\learning\\exceptions\\DataToRead.txt");
         try {
            FileReader fileReader = new FileReader(file);
            // ..
            // ..

        }
        catch (FileNotFoundException e) {
            System.out.println("Exception occurred during File Reading");
            e.printStackTrace();
        }


        // ...
        // ..
        // ..
        //System.out.println("File is Read");
    }

    public static void main(String[] args){
        Integer[] dateArray = {10, 11, 12, 13};
         Integer date = getValueByIndexPosition(dateArray,2);
         System.out.println("got the date value for index 2 : " + date);
        readFileContent();

    }
}
