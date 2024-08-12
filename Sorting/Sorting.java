package com.priyanshi.Sorting;
import java.util.Arrays;

// Insertion sort
// Selection sort
// - swap method
// - getMaxIndex method
// Bubble sort
public class Sorting {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        insertion(arr);
        System.out.println("Insertion sort:" + Arrays.toString(arr));
        selection(arr);
        System.out.println("Selection sort:" + Arrays.toString(arr));
        bubble(arr);
        System.out.println("Bubble sort:" + Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        // builds the final sorted array from LHS, one item at a time
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    // swap
                    swap(arr, j, j-1);
                } else{
                    break; // since LHS is already sorted
                }
            }
        }
    }

    static void selection(int[] arr) {
        // select an element (max/min) and put it on its correct index (position)
        for (int i = 0; i < arr.length; i++){
            // find the max item in the remaining array and swap with the element at its correct index
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static void swap(int[] arr, int first, int second){
        // to swap the element at the given indexes
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i; // i is the index of the maximum element
            }
        }
        return max;
    }

    static void bubble(int[] arr){
        // in every step, compare the adjacent elements
        boolean swapped; // to avoid checking the sorted part again
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            // for each step, the max item will w=come at the last respective index
            for (int j = 1; j < arr.length - i; j++){
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted, hence stop the program
            if (!swapped) { // OR if (swapped == false)
                // !false = true so the condition will run for swapped == false
                break;
            }
        }
    }
}
