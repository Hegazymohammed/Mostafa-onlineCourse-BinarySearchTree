package org.example.Homework1;

import org.example.TreeNode;

/**
 * 700 leetcode proplem
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
class SearchInBinarySearchTree{
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        if(root.val>val)
            return searchBST(root.left,val);
        else
            return searchBST(root.right,val);

    }
}