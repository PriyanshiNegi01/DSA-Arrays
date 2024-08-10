package com.priyanshi.Searching;

public class OrderAgnosticBS {

    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}; // ascending array
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
