package com.wxj.leetCode.linkedList;

/**
 * 给定一个链表，判断链表中是否有环。
 */
public class testHasCycle {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
       }
    }

    public boolean hasCycle(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        if(head == null){
            return false;
        }


        while (fast.next != null && fast.next.next != null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }


        }

        return false;
    }

}
