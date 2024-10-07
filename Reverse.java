package com.priyanshi.Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // Swapping Values in an Array
        int[] arr = {1, 8, 21, 50, 18};
        System.out.println("Original array: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
