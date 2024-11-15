package com.priyanshi.Sorting;

// Leetcode: https://leetcode.com/problems/set-mismatch/

class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Range: [1, N]
            if (arr[i] != arr[correctIndex]){ // 2nd condition: arr[i] != arr[arr[i]]) => when the element at i index is not
                // equal to value at own index
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index+1}; // return {repeated/duplicate no., missing no.}
            }
        }
        return new int[] {-1, -1}; // if nothing is repeated
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}