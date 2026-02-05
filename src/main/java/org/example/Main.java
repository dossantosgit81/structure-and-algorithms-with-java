package org.example;

import org.example.linkedlist.LinkedList;
import org.example.reucursion.Recursion;

public class Main {
    public static void main(String[] args) {

        Recursion recursion = new Recursion();

        String text = recursion.revertText("Hungáro", 6, 0);
        System.out.println(text);


    }
}
