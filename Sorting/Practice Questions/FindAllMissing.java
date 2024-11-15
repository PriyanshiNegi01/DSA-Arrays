package com.priyanshi.Sorting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

// Leetcode: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google

class FindAllMissing {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Cyclic sort code for [0, N]
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // index = value - 1
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else{
                i++;
            }
        }

        // After sorting, just find missing numbers
        // Here, the answer can be of variable length
        // That's why we have used List return type over here
        // Find All Missing
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){ // value = index + 1
                ans.add(index + 1);
            }
        }
        return ans;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}