package com.priyanshi.Sorting;

// Leetcode: https://leetcode.com/problems/missing-number/
// Amazon Question

class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr){ // sort function
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]; // since numbers and index both start from 0
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]){
                // 1st condition: Edge case for missing 'N',
                // 2nd condition: arr[i] != arr[arr[i]]) => when element at i index is not equal to value at own index
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }

        // search for first missing number, case 1 (check for the first index where the element isn't equal to index)
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        // otherwise, case 2 (when the last index is not there)
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}