package com.wxj.leetCode;

/**
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class testGetIntersectionNode {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x ){
            this.val = x;
            this.next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode n1 = headA;
        ListNode n2 = headB;

        while (n1 != n2){

          if(n1 == null){
              n1 = headB;
          }else {
              n1 = n1.next;
          }

          if(n2 == null){
              n2 = headA;
          }else {
              n2 = n2.next;
          }

        }

        return n1;
    }
}
