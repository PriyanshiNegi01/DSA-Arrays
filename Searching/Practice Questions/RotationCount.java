package com.priyanshi.Searching;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1; // if pivot == -1 (no pivot), then it will return the rotation count as 0
    }

    // use this for non-duplicates
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

    // use this for array with duplicate elements
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
