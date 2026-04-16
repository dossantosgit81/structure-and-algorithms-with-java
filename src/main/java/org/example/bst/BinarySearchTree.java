package org.example.bst;

public class BinarySearchTree {

    private Node root;

    public void insert(Integer key){
        if(root == null)
            root = new Node(key);
        else
            insertNode(key, root);
    
    }

    private void insertNode(Integer newKey, Node root){
        boolean isLeft = newKey < root.getKey();
        if(isLeft){
            if(root.getLeft() == null)
                root.setLeft(new Node(newKey));
            else
                insertNode(newKey, root.getLeft());
        }else{
            if(root.getRight() ==  null)
                root.setRight(new Node(newKey));
            else
                insertNode(newKey, root.getRight());
        }
    }

    public boolean search(Integer key){
        return false;
    }

    public void inOrderTraverse(){
    }

    public void preOrderTraverse(){
    }

    public void postOrderTraverse(){
    }

    public void remove(Integer key){
    }

    public Integer min(){
        return 0;
    }

    public Integer max(){
        return 1;
    }

    
}
