package com.priyanshi.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of Primitives
        int[] arr = new int[5];
        arr[0] = 21;
        arr[1] = 123;
        arr[2] = 70;
        arr[3] = 55;
        arr[4] = 240;
        // [21, 123, 70, 55, 240]
        System.out.println(arr[3]);

        // INPUT from user using for loop
//        System.out.print("Enter 5 elements: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }

//        // Methods to PRINT THE ELEMENTS of the array

        // Method 1: Arrays.toString(array_name) method (BEST)
        System.out.println(Arrays.toString(arr)); // converts array into a string and prints that string

//        // Method 2: FOR LOOP
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        // Method 3: ENHANCED FOR LOOP (for every element in array, print the element)
//        for (int num : arr) {
//            System.out.print(num + " "); // here, num represents element of the array
//        }

//        System.out.println(arr[5]); // index out of bound error

        // Array of Objects
        String[] str = new String[4];
        // Here, the array contains the reference variable to the objects (Strings) stored anywhere in the HEAP.

        // input using for loop
        System.out.print("Enter 4 elements: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Priyanshi";

        System.out.println(Arrays.toString(str));
    }
}
