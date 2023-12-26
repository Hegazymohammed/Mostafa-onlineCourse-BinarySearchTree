package org.example.Homework1;

//Convert sortedArray to binay search Tree

import org.example.TreeNode;

/**
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public  class ConvertSortedArraytoBinarySearchTree108LeetCode {
    public TreeNode sortedArrayToBST(int[] nums) {
        int length=nums.length-1;
        return sortedArrayToBST(nums,0,length);
    }

    public TreeNode sortedArrayToBST(int[]nums,int start,int end){
        if(start>end)
            return null;
        int middle=(int)(start+end)/2;
        TreeNode node=new TreeNode(nums[middle]);
        node.left=sortedArrayToBST(nums,start,middle-1);
        node.right=sortedArrayToBST(nums,middle+1,end);
        return node;
    }
}