/*
Define a generic method called checkOrder() that checks if four items are in ascending, neither, or descending order. The method should return -1 if the items are in ascending order, 0 if the items are unordered, and 1 if the items are in descending order.

The program reads four items from input and outputs if the items are ordered. The items can be different types, including integers, Strings, characters, or doubles.

Ex. If the input is:

bat hat mat sat
63.2 96.5 100.1 123.5
the output is:

Order: -1
Order: -1
 */
import java.util.Scanner;

public class WhatOrder {
    // TODO: Define a generic method called checkOrder() that
    //       takes in four variables of generic type as arguments.
    //       The return type of the method is integer


    // Check the order of the input: return -1 for ascending,
    // 0 for neither, 1 for descending



    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Check order of four strings
        System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next()));

        // Check order of four doubles
        System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
    }
}

