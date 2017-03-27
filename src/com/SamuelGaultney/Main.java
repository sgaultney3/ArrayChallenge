package com.SamuelGaultney;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    //This program sorts arrays from highest values to lowest

	int[] sortArray = getIntegers(5);
	printArray(sortArray);
	int[] unsorted = sortIntegers(sortArray);
	printArray(unsorted);

    }

    //-------------------------------------------------------------------------
    public static int[] getIntegers(int howMany) {
        System.out.println("Enter " + howMany + " numbers you wish to sort.\r");
        int[] values = new int[howMany];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    //------------------------------------------------------------------------

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
    //------------------------------------------------------------------------

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i=0; i<array.length; i++) {
          sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) { //while loop is used to reiterate the bubble style sort
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    //-----------------------------------------------------------------------

    //Alternative method to copy an array
    int[] copyofarray = Arrays.copyOf(array, array.length); //this creates copyofarray with the values of array
    // amd correct length of array
}
