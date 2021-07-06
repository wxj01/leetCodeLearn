package com.wxj.leetCode;

public class getKthFromEnd {


    /**
     * Definition for singly-linked list.
     * */
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public ListNode getKthFromEnd(ListNode head, int k) {

        if(head == null) return null;

        int i = 0;
        ListNode cur = head;
        while(cur != null){
            cur = cur.next;
            i++;
        }

        int j = i -k;
        while(j > 0 ){
            head = head.next;
            j--;
        }

        return head;

    }

    public static void main(String[] args) {
        getKthFromEnd();
    }
}
