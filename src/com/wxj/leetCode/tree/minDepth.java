package com.wxj.leetCode.tree;

/**
 *  二叉树的最小深度
 */

/**
 * Definition for a binary tree node.
 * */


public class minDepth {



    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right != null){
            return 1+ minDepth(root.right);
        }

        if(root.right == null && root.left != null){
            return 1+ minDepth(root.left);
        }

        return 1+ Math.min(minDepth(root.left),minDepth(root.right));
    }
}
