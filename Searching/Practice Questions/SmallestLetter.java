package com.priyanshi.Searching;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Binary Search
public class SmallestLetter {

    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'}; // ascending array
        char target = 'j';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in Java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) { // LHS - end changes
                end = mid - 1;
            } else { // RHS - start changes // target > letters[mid]
                start = mid + 1;
            }
        }
        return letters[start % letters.length ];
        // if the target is greater than the lexicographically greatest letter in the array, then the remainder will be 0,
        // i.e, the first element will be returned.
    }
}
