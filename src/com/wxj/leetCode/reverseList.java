package com.wxj.leetCode;

/**
 * 206. 反转链表
 *
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class reverseList {

    /**
     * Definition for singly-linked list.
     * */
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    //迭代法
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return  null;
        }

        ListNode dummy = null;
        ListNode cur = head;
        ListNode next = head;

        while (cur != null){
            next = next.next;
            cur.next = dummy;
            dummy = cur;
            cur = next;
        }

        return dummy;
    }
}
