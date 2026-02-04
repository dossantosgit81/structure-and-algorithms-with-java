package org.example;

import org.example.linkedlist.LinkedList;
import org.example.reucursion.Recursion;

public class Main {
    public static void main(String[] args) {

        Recursion recursion = new Recursion();

        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = recursion.sumArrayRecursive(arr, 0, arr.length-1);
        System.out.println(result);

    }
}
