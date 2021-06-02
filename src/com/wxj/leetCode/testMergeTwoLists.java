package com.wxj.leetCode;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 * @date 2021/6/1 0001 20:07
 */
public class testMergeTwoLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return  l1;
        }

        // 指向第一个位置
        ListNode dummp = new ListNode();
        ListNode curr = dummp;

        while (l1 != null && l2 != null){
            // 比较两个节点的值的大小
            if(l1.val <= l2.val){
                curr.next =  l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if(l1 == null){
            curr.next = l2;
        }

        if(l2 == null){
            curr.next = l1;
        }

//        return dummp;
        return dummp.next;

    }


}

