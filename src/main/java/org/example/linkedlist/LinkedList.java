package org.example.linkedlist;

import org.example.linkedlist.model.Node;

public class LinkedList {

    private Node head;
    private int count;

    public LinkedList(){
        this.head = null;
        this.count = 0;
    }

    public void push(int element){
        Node node = new Node(element);
        if (head == null) {
            head = node;
        }else {
            Node current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
        }
        this.count++;
    }

    public void print(){
        Node current = head;
        while (current != null){
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

}
