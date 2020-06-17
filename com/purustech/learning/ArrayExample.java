package com.purustech.learning;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] rollNumbers; // declare

        rollNumbers = new int[5]; // allocates memory
        rollNumbers[0] = 100;
        rollNumbers[1] = 101;
        rollNumbers[2] = 102;
        rollNumbers[3] = 103;
        rollNumbers[4] = 104;

        System.out.println("Element at index 0 is " + rollNumbers[0]); // 100
        System.out.println("Element at index 3 is " + rollNumbers[3]); // 103


        //Also the above declaration and allocation of arrays can be done in a single statement
        int[] rollNumberss = {100,101,102,103,104};

        // looping through the array elements
        for(int i=0; i < rollNumbers.length; i++)
            System.out.println("Element at index " + i + " is" + rollNumbers[i]);

        // multidimensional array, 2D array here
        int[][] rollNumberAndMarks = {
                {100, 101, 102},
                {750,650,800}
        };

        System.out.println("By using for loop getting the 2d array elements");
        for(int i=0; i < rollNumberAndMarks.length ; i++){
            for(int j=0; j < rollNumberAndMarks[i].length; j++){
                System.out.println(rollNumberAndMarks[i][j]);
            }
        }

        //Accessing 2D Array elements
        System.out.println("Roll number " + rollNumberAndMarks[0][0] + " Secured " + rollNumberAndMarks[1][0] + " Marks"); // 100 750
        System.out.println("Roll number " + rollNumberAndMarks[0][2] + " Secured " + rollNumberAndMarks[1][2] + " Marks");  // 102 800

        int[][][] sectionRollNumberAndMarks = {
                {
                 {100, 101, 102},
                 {750,650,800}
                },
                {
                  {200, 201, 202},
                  {890,600,830}
                }
        };

        System.out.println("2nd section roll number 202 mark is " + sectionRollNumberAndMarks[1][1][2]);

        // java.util.Arrays contains important operation for array manipulation which can be done on the arrays
        int[] copiedArray = Arrays.copyOfRange(rollNumbers, 1,3 ); // length will be return is 3-1 so 2 elements

        System.out.println("Copied Array is :");
        System.out.println(Arrays.toString(copiedArray)); //[101, 102]


        // Using System.arraycopy to copy array elements
        int[] copyTo = new int[3];

        System.arraycopy(rollNumbers, 2, copyTo, 0, 3);
        System.out.println("Copied array using system array copy " + Arrays.toString(copyTo));


        // Array sorting using Arrays.sort
        rollNumbers[0] = 101;
        rollNumbers[1] = 100;
        rollNumbers[2] = 103;
        rollNumbers[3] = 102;
        rollNumbers[4] = 104;

        Arrays.sort(rollNumbers);
        System.out.println("Sorted Array is :" + Arrays.toString(rollNumbers));

    }

}
