package com.wxj.leetCode.tree;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */

/**
 * Definition for a binary tree node.
 * */


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
