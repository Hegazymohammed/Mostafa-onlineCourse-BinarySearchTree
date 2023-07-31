package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BST {
    public TreeNode root;

    public BST(int value) {
        this.root = new TreeNode(value);
    }

    public TreeNode add(TreeNode treeNode, int value) {
        if (treeNode == null)
            return new TreeNode(value);
        if(treeNode.val >value)
            treeNode.left=add(treeNode.left,value);
        if(treeNode.val <value)
            treeNode.right=add(treeNode.right,value);
        return treeNode;

    }

    public void add(int value) {
        add(root, value);

    }

    public void printInOrder(TreeNode treeNode) {
        if (treeNode == null)
            return;
        printInOrder(treeNode.left);
        System.out.println(treeNode.val);
        printInOrder(treeNode.right);
    }

    public void printInOrder(){
        printInOrder(root);
    }

    public boolean search(TreeNode treeNode, int key){
           if(treeNode ==null)
               return false;

        if(treeNode.val >key)
           return  search(treeNode.left,key );
        else if(treeNode.val <key)
            return search(treeNode.right,key);
        return treeNode.val ==key;
    }

    public boolean search(int key){
        return search(root,key);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {

        return sortedArrayToBST(nums,0,nums.length-1);
    }

    public static TreeNode sortedArrayToBST(int[]nums,int start,int end){
        if(start>end)
            return null;
        int middle=(int)(start+end)/2;
        TreeNode node=new TreeNode(nums[middle]);
        node.left=sortedArrayToBST(nums,start,middle-1);
        node.right=sortedArrayToBST(nums,middle+1,end);
        return node;
    }
    public static void main(String[] args) {


        BST tree=new BST(2);
        tree.add(1);
        tree.add(3);

       }
}
