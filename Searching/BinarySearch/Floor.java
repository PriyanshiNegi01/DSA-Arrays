package com.priyanshi.Searching;

// Binary Search
public class Floor {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // ascending array
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // AIM: return the index of greatest number <= target
    // return the index if the target element exists
    // return END if it does not exist
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
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
        return end; // CHANGE from Binary Search
    }
}
