package com.priyanshi.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {
        // 2D array is just like a matrix
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        Scanner sc = new Scanner(System.in);

//        int[][] arr = new int[3][];
        // The number of rows is mandatory
        // The number of columns is not necessary to specify

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr2d[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // gives us the number of rows

        System.out.println("Enter the array elements: ");
        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // output using for loops
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            // after printing every row, add a new line to get a matrix representation
            System.out.println();
        }


        // output using Arrays.toString method
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // output using enhanced for loop with the function
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
