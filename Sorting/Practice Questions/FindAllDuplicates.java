package com.priyanshi.Sorting;

import java.util.ArrayList;
import java.util.List;

// Leetcode: https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Amazon, Microsoft question

class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Range [1, N]
            if (arr[i] != arr[correctIndex]){ // OR: arr[i] != arr[arr[i]]) => when the element at i index is not equal
                // to value at own index
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }
        // Now, the array is sorted.
        // Find All Duplicates (check for the first index where the element isn't equal to index)
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){ // value = index + 1
                ans.add(arr[index]); // the ans is the element which isn't at the correct index
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}