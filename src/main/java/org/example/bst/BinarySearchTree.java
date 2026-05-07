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
        this.printInOrderTraverse(this.root);
    }

    public void preOrderTraverse(){
        this.printPreOrderTraverse(this.root);
    }

    public void postOrderTraverse(){
        this.printPostOrderTraverse(this.root);
    }

    private void printInOrderTraverse(Node el){
        if(el != null){
            printInOrderTraverse(el.getLeft());
            System.out.println(el.getKey());
            printInOrderTraverse(el.getRight());
        }
    }

     private void printPreOrderTraverse(Node el){
        if(el != null){
            System.out.println(el.getKey());
            printPreOrderTraverse(el.getLeft());
            printPreOrderTraverse(el.getRight());
        }
    }

     private void printPostOrderTraverse(Node el){
        if(el != null){
            printPostOrderTraverse(el.getLeft());
            printPostOrderTraverse(el.getRight());
            System.out.println(el.getKey());
        }
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
