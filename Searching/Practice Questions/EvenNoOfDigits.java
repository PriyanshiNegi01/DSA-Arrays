package com.priyanshi.Searching;

// Linear Search
public class EvenNoOfDigits {

    public static void main(String[] args) {
        // 7. Check whether a number contains even digits or not
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));

//        System.out.println(digits(-1234));
//        System.out.println(digits(0));

        System.out.println(digits2(-345678));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
         for (int num : nums) {
             if(even(num)) {
                 count++;
             }
         }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num) { // second way of finding the no. of digits (optimized version)
        if (num < 0) {
            num = num *  -1;
        }
        return (int)(Math.log10(num)) + 1; // shortcut method
    }

    static int digits(int num) {

        if (num < 0) { // if the number is negative, make it positive
            num = num *  -1;
        }

        if (num == 0) { // if the number is 0, return 1 as it contains 1 digit
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }
}
