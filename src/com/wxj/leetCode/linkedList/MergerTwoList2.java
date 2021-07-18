package com.wxj.leetCode.linkedList;

/**
 *    两个链表 一个升序 一个降序，将合并一个有序的链表
 *
 */
public class MergerTwoList2 {
    public class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }

    // 反转链表
    private Node reverList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node dummy = null;
        Node cur = head;
        Node next = head;
        while (cur != null){
            next = next.next;
            cur.next = dummy;
            dummy = cur;
            cur = next;
        }

        return dummy;
    }

    private Node megeList(Node h1,Node h2){

        if(h1 == null){
            return h2;
        }

        if(h2 == null){
            return h1;
        }

        Node dummy = new Node();
        Node cur = dummy;

        while (h1 != null && h2 != null){
            if(h1.val < h2.val){
                cur.next = h1;
                h1 = h1.next;
            }else {
                cur.next = h2;
                h2 = h2.next;
            }

            cur = cur.next;
        }
        return dummy;
    }
}
