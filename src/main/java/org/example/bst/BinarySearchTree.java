package org.example.bst;

public class BinarySearchTree {

    private Node root;

    public void insert(Integer key){
        if(root == null)
            root = new Node(key);
        //else
    
    }

    private void insertNode(Node rootNode, Integer newKey){
        if(firstMinorSecond(rootNode.getKey(), newKey)){
            if(rootNode.getLeft() == null)
                rootNode.setLeft(newKey);
        }else{

        }
    }

    private boolean firstMinorSecond(Integer first, Integer second){
        return first < second;
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
