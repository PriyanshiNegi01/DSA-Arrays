package com.priyanshi.Searching;

// Linear Search
public class MinInArray {

    public static void main(String[] args) {
        // 4. Finding the minimum number in array
        int[] arr = {18, 12, -7, 30, 14, 28};
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
         int ans = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] < ans) {
                 ans = arr[i];
             }
         }
         return ans;
    }
}
