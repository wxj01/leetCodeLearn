package com.wxj.leetCode;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
 */
public class testDetectCycle {

    class ListNode {
        int val ;
        ListNode next;
        ListNode(int x){
            this.val  = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        boolean isCycle = false;

        while (fast.next != null && fast.next.next != null){
            fast  = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                isCycle = true;
                break;
            }
        }

        fast = head;
        if(!isCycle){
            return  null;
        }

       while (fast != slow){
           fast = fast.next;
           slow = slow.next;
       }

        return fast;


    }
}

