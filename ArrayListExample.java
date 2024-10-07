package com.priyanshi.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            Syntax:
            ArrayList<Datatype> list = new ArrayList<>(default size);
         */

        ArrayList<Integer> list = new ArrayList<>(10);
        // You can't pass Primitives, you can pass Wrapper classes

//        list.add(280); // to ADD nan element
//        list.add(80);
//        list.add(24);
//        list.add(500);
//        list.add(120);
//        list.add(11);
//
//        System.out.println(list.contains(24));
//
//        System.out.println(list);
//        list.set(0, 21); // to UPDATE an element
//        System.out.println(list);
//
//        list.remove(1); // to REMOVE an element (using index)
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass the index, list[index] syntax will not work here
        }

        // output
        System.out.println(list);
    }
}
