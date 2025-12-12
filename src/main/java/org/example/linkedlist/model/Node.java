package org.example.linkedlist.model;

public class Node {

    private int element;
    private Node next;

    public Node(int element){
        this.element = element;
    }

    public int getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
