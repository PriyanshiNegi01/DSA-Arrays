package com.priyanshi.Searching;

// Linear Search
public class MinMaxIn2DArray {

    public static void main(String[] args) {
        // 6. Finding the maximum number in 2D array
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        System.out.println("The minimum value in the array is: " + min(arr));
        System.out.println("The maximum value in the array is: " + max(arr));
    }

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) { // every single row is going to be an array itself
            for (int element : ints) { // and in that integer array, each of them will have individual elements
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) { // every single row is going to be an array itself
            for (int element : ints) { // and in that integer array, each of them will have individual elements
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
