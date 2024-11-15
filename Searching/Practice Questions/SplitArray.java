package com.priyanshi.Searching;

// https://leetcode.com/problems/split-array-largest-sum/
// Binary Search
public class SplitArray {
    public static void main(String[] args) {

    }

    public static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]); // int the end of the loop, it will contain the max value from the array
            end += nums[i];
        }

        // Binary Search
        while(start < end){
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide the array into with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){ // for each loop
                if(sum + num > mid){
                    // you cannot add this element in this subarray, so make a new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else{
                    sum += num;
                }
            }

            // 2 checks
            if(pieces > m){
                start = mid + 1;
            } else{
                end = mid;
            }
        }

        return end; // here, start == end
    }
}
