package org.example.linkedlist;

import org.example.linkedlist.model.Node;

public class LinkedList implements List{

    private Node head;
    private int count;

    public LinkedList(){
        this.head = null;
        this.count = 0;
    }

    @Override
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

    @Override
    public void insert(int element, int position) {

    }

    @Override
    public int getElementAt(int index) {
        return 0;
    }

    @Override
    public void remove(int element) {

    }

    @Override
    public int indexOf(int element) {
        return 0;
    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    public void print(){
        Node current = head;
        while (current != null){
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

}
