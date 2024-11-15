package com.priyanshi.Searching;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Rotated Binary Search

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if(pivot == -1) {
            // just do normal Binary Search
            return binarySearch(nums, target, 0, nums.length - 1); // BS in first half
        }
        // if pivot is found, you have found 2 ASC sorted arrays
        // 3 cases
        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[0]){ // target >= start
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot + 1 , nums.length - 1);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in Java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) { // LHS - end changes
                end = mid - 1;
            } else if (target > arr[mid]) { // RHS - start changes
                start = mid + 1;
            } else { // target == arr[mid]
                // ans found
                return mid;
            }
        }
        // no value will be returned by the while loop if the target element does not exist
        return -1;
    }

    // this will not work for duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // 4 cases
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){ // mid element < start element => All the elements after the mid element are useless
                // because they will be smaller than the start element since arrays on both the sides are in ASC order
                end = mid - 1;
            } else{ // mid element > start element => All the elements before the mid element are useless
                start = mid + 1;
            }
        }

        return -1;
    }

    // Rotated Binary Search with duplicate elements
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // 3 cases
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            // below loops are the modified ones
            // if elements at middle, start and end are equal, then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicate elements

                // NOTE: What if these elements at start and end were the pivots?
                // Check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                // Check whether end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // 2 sub cases
            // Left side is sorted, so pivot should be on the right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else{
                end = mid - 1; // pivot should be on left side
            }
        }

        return -1;
    }
}