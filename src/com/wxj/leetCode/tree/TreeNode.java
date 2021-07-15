package com.wxj.leetCode.tree;

public class TreeNode {

        int val;
        com.wxj.leetCode.tree.TreeNode left;
        com.wxj.leetCode.tree.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, com.wxj.leetCode.tree.TreeNode left, com.wxj.leetCode.tree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}
