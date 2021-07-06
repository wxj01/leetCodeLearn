package com.wxj.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 输入: 1->2
 * 输出: false
 *
 * 输入: 1->2->2->1
 * 输出: true
 */
public class isPalindrome {

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



    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        ListNode pre = head, prepre = null;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        if(fast != null) {
            slow = slow.next;
        }
        while(pre != null && slow != null) {
            if(pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
//        递归 超出时间限制
        //        输入: 1->2->2->1
          if(head == null || head.next == null) return true;

          ListNode pre = null,cur = head;

          while (cur != null && cur.next != null){
              pre = cur;
              cur = cur.next;
          }

          if(head.val != cur.val) return false;

          ListNode next  = head.next;

//          head.next = null;
          pre.next = null;

          return isPalindrome(head.next);


    }


    public boolean isPalindrome3(ListNode head){

          if (head == null || head.next == null) return true;
          List<Integer> list = new ArrayList<>();
          ListNode cur = head;

          while (cur != null){
              list.add(cur.val);
              cur = cur.next;
          }

          int start = 0, end = list.size() -1;
          while (start <= end){
              if (!list.get(start).equals(list.get(end))) return false;
              start++;
              end--;
          }
          return true;
    }


    public boolean isPalindrome4(ListNode head){
        Stack<Integer> stack  = new Stack<>();

        ListNode cur = head;

        while (cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }

        while (head != null){
            if(!stack.pop().equals(head.val)) return false;
            head = head.next;
        }

        return false;
    }


}
