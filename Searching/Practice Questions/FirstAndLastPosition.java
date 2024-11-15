package com.priyanshi.Searching;

import java.util.Arrays;

// Leetcode question: Smallest Letter Greater than Target
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Binary Search
public class FirstAndLastPosition {
    public static void main(String args[]){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.print(Arrays.toString(searchRange(nums, target))); // use the Arrays.toString function to display o/p
    }

    // copy from below after removing 'static' for the class Solution on Leetcode
    public static int[] searchRange(int[] nums, int target){

        int[] ans = {-1, -1}; // if ans not found

        // check for first occurrence of target first
        ans[0] = search(nums, target, true); // start index

        if(ans[0] != -1){
            ans[1] = search(nums, target, false); // end index
        }

        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else{
                // potential ans found
                ans = mid; // potential ans if mid =  target
                if(findStartIndex){ // findStartIndex == true
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
