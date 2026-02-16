package org.example;

import org.example.linkedlist.LinkedList;
import org.example.reucursion.Recursion;

public class Main {
    public static void main(String[] args) {

        Recursion recursion = new Recursion();
        int steps = 4;
        int possibilities = recursion.challengeUpstairs(steps);
        System.out.println("Para " + steps + " " + "Existe " + possibilities);
    }
}
