package com.wxj.leetCode;

public class removeNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head,slow = head;
        ListNode dummy = new ListNode();
        dummy.next = head;

        n = n+1;

        while(fast != null){
            fast = fast.next;
            if(n == 0){
                slow = slow.next;
            }else{
                n--;
            }
        }

        slow.next =slow.next.next;
        return dummy.next;
    }
}
