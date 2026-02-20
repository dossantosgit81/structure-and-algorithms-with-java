package org.example;

import org.example.linkedlist.LinkedList;
import org.example.reucursion.Recursion;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Recursion recursion = new Recursion();
        long input = 50;
        long value = recursion.fibRecursionWithMemoization(input, new HashMap<>());
        System.out.println("With memoization " + value);

        long valueWithoutMemoization = recursion.fibRecursion(Integer.valueOf(String.valueOf(input)));
        System.out.println("Without memoization " + valueWithoutMemoization);
    }
}
