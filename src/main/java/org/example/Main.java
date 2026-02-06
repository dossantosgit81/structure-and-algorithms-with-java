package org.example;

import org.example.linkedlist.LinkedList;
import org.example.reucursion.Recursion;

public class Main {
    public static void main(String[] args) {

        Recursion recursion = new Recursion();
        boolean value = recursion.isPolydrome("arara", 4, 0);
        System.out.println(recursion.revertTextPlyndrome("arara", 4, 0) + " " + value);


    }
}
