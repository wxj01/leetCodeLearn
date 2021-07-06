package com.wxj.leetCode;

/**
<<<<<<< HEAD
 * @author wxj
 * @version 1.0
 * @description: TODO
 *
 * 给定两个（单向）链表，判定它们是否相交并返回交点。请注意相交的定义基于节点的引用，而不是基于节点的值。
 * 换句话说，如果一个链表的第k个节点与另一个链表的第j个节点是同一节点（引用完全相同），则这两个链表相交。
 *
 *
 * @date 2021/6/7 0007 15:46
 */
public class testGetIntersectionNode {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            return null;

    }

}
=======
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
>>>>>>> origin/master
