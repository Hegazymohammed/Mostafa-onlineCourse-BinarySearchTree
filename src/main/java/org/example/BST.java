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

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums,0,nums.length-1);
    }
    public static TreeNode constructMaximumBinaryTree(int[] nums,int start,int end) {
        //i want to make a method to return the index of the maximum
        if(start>=end)
            return null;

        int index=findMaxByIndex(nums,start,end);
        TreeNode node=new TreeNode(nums[index]);
        //then see i i-1>0 put it in the left
        if(index>0)
            node.left=constructMaximumBinaryTree(nums,start,index);
        //then see i i+1>0 put it int in right
        if(index+1<end)
            node.left=constructMaximumBinaryTree(nums,index+1,end);

        return node;
    }

    public static int findMaxByIndex(int nums[],int start,int end){
        int max=nums[start];
        int index=start;
        for(int i=start+1;i<=end;++i){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }

        }
        return index;

    }

    static class  Solution {
        static int max_sum=Integer.MIN_VALUE;
        public  static int maxPathSum1(TreeNode root) {

            if (root == null)
                return 0;
            int leftValue = maxPathSum1(root.left);
            int rightValue = maxPathSum1(root.right);
            int target=Math.max(root.val,root.val+leftValue+rightValue);
            max_sum = Math.max(max_sum,
                    Math.max(target,
                            Math.max(root.val + leftValue, root.val + rightValue)));
            return Math.max(root.val + leftValue, root.val + rightValue);
        }
        public static int maxPathSum(TreeNode root) {

            maxPathSum1(root);
            return max_sum;
        }

    }
    public static void main(String[] args) {
        BST bst=new BST(2);
        bst.add(1);
        bst.add(3);
        System.out.println(Solution.maxPathSum(bst.root));

       }
}
