package com.priyanshi.Searching;

import java.util.Arrays;

// Linear Search
public class SearchIn2DArray {

    public static void main(String[] args) {
        // 5. Searching in 2D array
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        int[] ans = search(arr, target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++ ) {
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // making a new object
                }
            }
        }
        return new int[]{-1, -1};
    }
}
