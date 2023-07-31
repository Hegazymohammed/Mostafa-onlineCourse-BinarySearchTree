package org.example;

public class BST {
    private Node root;

    public BST(int value) {
        this.root = new Node(value);
    }

    public Node add(Node node, int value) {
        if (node == null)
            return new Node(value);
        if(node.value>value)
            node.left=add(node.left,value);
        if(node.value<value)
            node.right=add(node.right,value);
        return node;

    }

    public void add(int value) {
        add(root, value);

    }

    public void printInOrder(Node node) {
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.println(node.value);
        printInOrder(node.right);
    }

    public void printInOrder(){
        printInOrder(root);
    }

    public boolean search(Node node,int key){
           if(node==null)
               return false;

        if(node.value>key)
           return  search(node.left,key );
        else if(node.value<key)
            return search(node.right,key);
        return node.value==key;
    }

    public boolean search(int key){
        return search(root,key);
    }
    public static void main(String[] args) {
        BST tree = new BST(10);

        tree.add(20) ;
        tree.add(30) ;
        tree.add(1) ;
        tree.add(5);
        tree.add(-2);
        System.out.println(tree.search(5));
       }
}
