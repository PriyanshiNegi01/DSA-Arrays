package com.priyanshi.Arrays;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        // Swapping Values in an Array
        int[] arr = {1, 8, 21, 50, 18};
        System.out.println("Original array: " + Arrays.toString(arr));

        swap(arr, 0, 4); // swapping elements at the 0th and 4th index

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
