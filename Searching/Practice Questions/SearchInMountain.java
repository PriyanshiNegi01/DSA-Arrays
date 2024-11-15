package com.priyanshi.Searching;

// https://leetcode.com/problems/find-in-mountain-array/
// If the number exists more than once in the array, then return the minimum index.
// If the number does not exist in the array, return -1.
// Binary Search

public class SearchInMountain {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(nums, target));
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr); // index of peak element
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){ // DESC order
                // You are in decreasing part of the array
                // arr[mid] may be the answer, but look on LHS
                // Therefore, end != mid - 1
                end = mid;
            } else{ // ASC order
                // You are in increasing part of the array
                // arr[mid+1] may be the answer, but look on RHS
                start = mid + 1; // because wkt (mid + 1) element > mid element
            }
        }
        // In the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find maximum element in the above 2 checks
        // hence, when they are pointing to just one element, it is the max one because that is what the checks says
        // More elaboration: At any point of time for start and end, they have the best possible answer till that time
        // and so if only one item is remaining, then it is the best possible answer
        return start; // or return end as both are equal
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        /*
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        */

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in Java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) { // ascending order
                if (target < arr[mid]) { // LHS - end changes
                    end = mid - 1;
                } else { // (target > arr[mid]) RHS - start changes
                    start = mid + 1;
                }
            } else { // descending order
                if (target > arr[mid]) { // LHS - end changes
                    end = mid - 1;
                } else { // (target < arr[mid]) RHS - start changes
                    start = mid + 1;
                }
            }
        }
        // no value will be returned by the while loop if the target element does not exist
        return -1;
    }
}
