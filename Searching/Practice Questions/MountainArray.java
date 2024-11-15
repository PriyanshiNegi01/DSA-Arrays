package com.priyanshi.Searching;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Binary Search

public class MountainArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 4, 3, 2};
        int peakIndex = peakIndexInMountainArray(nums); // index of the max element
        System.out.println(peakIndex);
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
}
