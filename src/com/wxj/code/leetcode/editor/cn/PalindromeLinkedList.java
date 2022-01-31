package com.wxj.code.leetcode.editor.cn;

/**
 * 回文链表
 * @author wxj
 * @date 2022-01-31 09:47:26
 */
public class PalindromeLinkedList{
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head,slow = head, cur = head;
        ListNode dummy = null;

        while (fast != null && fast.next != null){
            fast = fast.next.next;

            slow = slow.next;
            cur.next = dummy;
            dummy = cur;
            cur = slow;

        }

        if(fast != null) {
            slow = slow.next;
        }

        while (dummy != null && slow != null){

            if (dummy.val != slow.val){
                return false;
            }

            dummy = dummy.next;
            slow = slow.next;
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
