package com.priyanshi.Searching;

import java.util.Arrays;

// Linear Search
public class SearchInStrings {

    public static void main(String[] args) {
        // 2. Searching in Strings
        String name = "Priyanshi";
        char target = 'a';
        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) { // length() is a function/method in String class
            return false;
        }

        for (char ch : str.toCharArray()) { // to use the 'for each' loop, you need an array or collection.
            // so, we convert the string to character array using the 'toCharArray' function
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) { // length() is a function/method in String class
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
