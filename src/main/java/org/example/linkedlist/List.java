package org.example.linkedlist;

import org.example.linkedlist.model.Node;

public interface List {

    void push(int element);
    void insert(int element, int position);
    int getElementAt(int index);
    void remove(int element);
    int indexOf(int element);
    void removeAt(int index);
    boolean isEmpty();
    int size();
    void print();
}
