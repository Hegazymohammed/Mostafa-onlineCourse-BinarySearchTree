package org.example.homework2;


// 98 leetcode proplem
import org.example.BST;
import org.example.TreeNode;

class  Soluation{
     static boolean  leftTree=true;
   static   boolean rightTree=true;
     public static boolean isValidBST(TreeNode root){
        long max=Long.MAX_VALUE;
         long min=Integer.MIN_VALUE;

         return isValidBST(root,min,max);

     }

     public static boolean isValidBST(TreeNode root,long minimum,long maximum){
         //maxi for left root
         if(root==null)
             return true;
         boolean valid=root.val>minimum&&root.val<maximum;
         if(!valid)
             return false;

         //minimum for right root
         if(root.left!=null)
             leftTree=isValidBST(root.left,minimum,root.val);
         if(!leftTree)
             return false;
         if(root.right!=null)
             leftTree=isValidBST(root.right,root.val,maximum);
         return rightTree;

     }




 }