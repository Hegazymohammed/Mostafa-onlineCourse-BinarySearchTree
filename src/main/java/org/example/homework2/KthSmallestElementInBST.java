package org.example.homework2;


import org.example.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * Problem #2: LeetCode 230 - Kth Smallest Element in a BST
 */
public class KthSmallestElementInBST {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> nodes=new ArrayList<>();
        Inorder(root,nodes);
        return nodes.get(k-1);

    }

    public void Inorder(TreeNode root,List<Integer>nodes){
        if(root==null)
            return ;
        Inorder(root.left,nodes);
        nodes.add(root.val);
        Inorder(root.right,nodes);
    }
}
