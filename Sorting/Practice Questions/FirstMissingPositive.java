package com.priyanshi.Sorting;

// Leetcode: https://leetcode.com/problems/first-missing-positive/
// Hard question. Why? Because it is not directly telling us that it will be using Cyclic sort.
// Amazon question
class FirstMissingPositive {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // since positive numbers start from 1
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){ // ignore the negatives
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }

        // search for first missing positive number, case 1 (check for the first index where the element isn't positive)
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        // otherwise, case 2 (when all positive numbers from 1 to N are present)
        return arr.length + 1; // return (N+1)
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}