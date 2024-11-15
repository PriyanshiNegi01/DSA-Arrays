package com.priyanshi.Searching;

// Leetcode
public class MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3}, // 10 is max
                {3, 5}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col (individual elements)
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int acc : person) {
                sum += acc;
            }
            // now we have sum of accounts of person
            // check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
