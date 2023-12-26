package org.example.homework2;

import org.example.TreeNode;

/*
Problem #3: LeetCode 235 - Lowest Common Ancestor of a Binary Search Tree
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncstorOfBST {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root.left!=null&&root.val>p.val&&root.val>=q.val)
            return lowestCommonAncestor(root.left,p,q);
        else if(root.right!=null&&root.val<=p.val&&root.val<q.val)
            return   lowestCommonAncestor(root.right,p,q );

        return root;
    }
}
