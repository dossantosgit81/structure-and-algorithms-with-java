package org.example.bst;

public class Node {

    public Node(Integer key){
        this.key = key;
    }

    private Integer key;
    private Integer left;
    private Integer right;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    
    
}
