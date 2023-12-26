package org.example.leetCodeLinkedListProplems;


import com.sun.source.tree.Tree;
import org.example.BST;
import org.example.TreeNode;

import java.util.*;

class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
        }
class Solution {

    public static ListNode[] splitListToParts(ListNode head, int k) {

        //make array
        ListNode[]array=new ListNode[k];
        //getsize method
        int length=getLength(head);

        int mod=length%k;

        int div=length/k ;

        int index=0;
        array[index++]=head;
        k--;

        ListNode current= head;
        while(k>0){
            int counter=mod>0?div+1:div;
            mod--;

            while(current!=null&&counter>0){
                current=current.next;
                counter--;
            }
            ListNode temp=current!=null?current:current;
            if(current!=null)
                current.next=null;
            array[index++]=current;
            current=temp;
            k--;
        }
        return array;

    }

    public static int getLength(ListNode head){
        int value=0;
        while(head!=null){
            value++;
            head=head.next;
        }
        return value;
    }
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode dummyHead=new ListNode(-111);
        ListNode last=dummyHead;


        boolean isDublicate=false;
        while(head!=null){
            ListNode previous=head;
            ListNode current=head.next;
            isDublicate=false;
            if(current!=null&&head.val==current.val){


                while(current!=null&&head.val==current.val){


                    current=current.next;
                }
                head=current;

            }
            else{

                last.next=previous;
                last=previous;
                head=head.next;
            }







        }
        return dummyHead.next;

    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode cur = prev.next;


        for (int i = left; i < right; i++) {
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = prev.next;
            //next.next = cur;
            prev.next = next;
        }
        return dummy.next;


    }

    public static ListNode createListNode(int []array){
        int length= array.length;
        ListNode node=new ListNode(array[0]);
        ListNode first=node;
        int counter=1;
        while(counter<length){
            node.next=new ListNode(array[counter++]);
            node=node.next;
        }
        return first;
   }

    public static void main(String[] args) {
      List<String>list=new ArrayList<>(List.of("hegazy","mohammed","ali","mostafa"));
      boolean find=list.stream().filter((user)->user.equals("ali")).findFirst().isPresent();
        System.out.println(find);

    }
}
