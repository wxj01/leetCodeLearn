package com.wxj.leetCode;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 *
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点
 *
 * 正常杀手需要找到A的把柄才可以杀掉A，
 * 可现在找到A本人后竟然没有可以获取A把柄的途径
 * A得知我们要杀他，心生一计，可助你完成任务
 * A说我有B的把柄，你杀了B，我改头换面，以B的身份活着
 * GC也会自动清理掉B的尸体，没人会知道的
 *
 * 作者：桂继宏
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnarn7/?discussion=7wCHAG
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 *
 * @date 2021/6/1 0001 20:40
 */
public class testDeleteNode {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public void deleteNode(ListNode node) {

          node.val = node.next.val;
          node.next = node.next.next;
    }
}