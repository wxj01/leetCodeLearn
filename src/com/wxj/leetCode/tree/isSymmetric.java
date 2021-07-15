package com.wxj.leetCode.tree;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */

/**
 * Definition for a binary tree node.
 * */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {

        if(root == null){
            return true;
        }

        return cmp(root.left,root.right);
    }

    public boolean cmp(TreeNode node1,TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }

        if(node1 == null || node2 == null || node1.val != node2.val){
            return false;
        }

        return cmp(node1.left,node2.right) && cmp(node1.right,node2.left);
    }
}
