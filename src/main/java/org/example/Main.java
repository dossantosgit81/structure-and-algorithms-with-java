package org.example;

import org.example.linkedlist.LinkedList;
import org.example.reucursion.Recursion;

public class Main {
    public static void main(String[] args) {

        Recursion recursion = new Recursion();
        boolean result = recursion.isPalindromeUsingTwoPointers("osso", 0, 3);

        System.out.println(result);

    }
}
