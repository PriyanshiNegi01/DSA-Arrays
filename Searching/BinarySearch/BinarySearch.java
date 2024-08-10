package com.priyanshi.Searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}; // ascending array
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index if the target element exists
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in Java
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
}
