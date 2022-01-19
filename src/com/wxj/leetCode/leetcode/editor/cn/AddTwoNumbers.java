/**
  * 题目Id：2
  * 题目：两数相加
  * 日期：2022-01-19 14:58:48
*/
//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
// Related Topics 递归 链表 数学 👍 7378 👎 0

package com.wxj.leetCode.leetcode.editor.cn;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
        System.out.println("Hello world");
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

/**
 * @description:
 *
    将当前结点初始化为返回列表的哑结点。
    将进位 carrycarrycarry 初始化为 0。
    将 p 和 q 分别初始化为列表 l1 和 l2 的头部。
    遍历列表 l1 和 l2直至到达它们的尾端。
    将 x 设为结点 p 的值。如果 ppp 已经到达 l1 的末尾，则将其值设置为 0。
    将 y 设为结点 q 的值。如果 qqq 已经到达 l2 的末尾，则将其值设置为 0。
    设定 sum=x+y+carry。
    更新进位的值，carry=sum/10。
    创建一个数值为 (sum mod 10) 的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点。
    同时，将 p 和 q 前进到下一个结点。
    检查 carry=1是否成立，如果成立，则向返回列表追加一个含有数字 1 的新结点。
    返回哑结点的下一个结点。

 *
 * @author wangxinjian
 * @date 2022/1/19 0019 16:14
 * @version 1.0
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null){

            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum =  x + y + carry;
            carry = sum / 10 ;
            curr.next = new ListNode(sum % 10 );
            curr = curr.next;
            if(p != null){ p = p.next; }
            if(q != null){ q = q.next; }
        }
        if(carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 