package com.priyanshi.Searching;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Binary Search
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for target to lie in the range
        while(target > arr[end]){
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
