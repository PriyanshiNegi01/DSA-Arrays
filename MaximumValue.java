package com.priyanshi.Arrays;

public class MaximumValue {

    public static void main(String[] args) {
        // Maximum Value of an Array
        int[] arr = {1, 8, 21, 50, 18};
        System.out.println("The maximum value in the array is: " + max(arr));
        System.out.println("The maximum value for the given range is: " + maxRange(arr, 1, 3));
    }

    // Work on edge cases for functions

    // Imagine that arr is not empty
    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int maxVal = arr[0]; // initialize max with first element of array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Maximum value in a range
    static int maxRange(int[] arr, int start, int end) {

        if (end < start) { // edge case
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start]; // initialize max with first element of array
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
