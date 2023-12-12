package com.priyanshi;

// Linear Search
public class LinearSearch {

    public static void main(String[] args) {
        // 1. Searching in an array
        int[] nums = {25, 1, -2, -12, 18, 21, -42, 55, 28};
        int target = 210;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // Search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) { // length not having brackets as it is a variable
            return false;
        }

        // run a for loop
        for (int element : arr) { // for every element in the array
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence, the target is not found
        return false;
    }

    // Search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) { // for every element in the array
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence, the target is not found
        return Integer.MAX_VALUE;
    }

    // ORIGINAL LINEAR SEARCH
    // Search for an element in the array
    // If item found, return the index
    // Otherwise, if item not found, return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is equal to target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence, the target is not found
        return -1; // returning -1 because -1 will never be an index
    }

}