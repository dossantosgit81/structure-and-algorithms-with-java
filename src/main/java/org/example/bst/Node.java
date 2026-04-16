package org.example.bst;

public class Node {

    public Node(Integer key){
        this.key = key;
    }

    private Integer key;
    private Node left;
    private Node right;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    
    
}
