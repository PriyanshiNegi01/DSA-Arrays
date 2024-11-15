package com.priyanshi.Sorting;

// Leetcode: https://leetcode.com/problems/find-the-duplicate-number/
// Amazon, Microsoft question

class FindDuplicate {
    public int findDuplicate(int[] nums) {
        // Cyclic sort code for range [1, N]
        int i = 0;
        // Find the Duplicates
        // Given in question: There is only 1 repeated number
        while (i < nums.length) {
            if (nums[i] != i + 1){ // value != index + 1
                int correctIndex = nums[i] - 1; // index = value - 1
                if (nums[i] != nums[correctIndex]){ // unique element at the index
                    swap(nums, i, correctIndex);
                } else{ // duplicate element at the index
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        // if there are no duplicates
        return -1;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}