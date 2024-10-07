package com.priyanshi.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 19;

        // Q: Store a person's name
        String name = "Priyanshi Negi";

        // Q: Store 5 roll numbers

        // ARRAY: A collection of data types
        // All the types of data must be the same
        /*
            Syntax:
            datatype[] variable_name = new datatype[size]
         */

//        int[] rnos = new int[5]; // LHS: reference variable, RHS: object

        // LHS: declaration...Compile time, RHS: actual creation of object in memory...Run time (Dynamic Memory Allocation)
        // Dynamic Memory Allocation: Assigning the memory space during the execution time or run time
        // 'new' keyword --> used to create an object

        // OR directly
//        int[] rnos2 = {21, 50, 24, 12}; // directly assigning
        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialization: here the actual object is being created in the memory (heap)

        /*
            In Java, there is no concept of pointers i.e, you can't get the address
            It totally depends on the JVM whether the memory allocation is going to be continuous or not
            1. Array or any other objects are created in heap
            2. Heap objects are not continuous
            3. Dynamic Memory Allocation
            Hence, array objects in Java may not be continuous.
         */

        System.out.println(ros[0]); // by default, the elements are 0 for an integer array

        String[] arr = new String[4];
        System.out.println(arr[0]); // by default, the elements are 'NULL' for a String array
        // 'NULL' is a special value, literal, that is the by default value of what reference variables point to (for NON-PRIMITIVES)
        // You can assign NULL to only non-primitives, not primitives.
        // You can typecast NULL to any type as well

        // iterating using enhanced for loop to print the elements
        for (String element : arr) {
            System.out.println(element);
        }

    }
}