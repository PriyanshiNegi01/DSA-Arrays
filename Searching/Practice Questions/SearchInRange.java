package com.priyanshi.Searching;

// Linear Search
public class SearchInRange {

    public static void main(String[] args) {
        // 3. Searching in a Range
        int[] arr = {18, 12, -7, 30, 14, 28};
        int target = 30;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is equal to target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence, the target is not found
        return -1; // returning -1 because -1 will never be an index
    }
}
