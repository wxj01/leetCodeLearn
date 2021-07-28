package com.wxj.leetCode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * preorderTraversal
 *
 * 二叉树的前序遍历
 */
public class preorderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null){
            return list;
        }

        list.add(root.val);

        preorderTraversal(root.left);

        preorderTraversal(root.right);

        return list;

    }

    // 第二种解法
    public List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return  res;
        }

        Stack<TreeNode>  stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(Integer.valueOf(node.val));
            if(node.right != null){
                stack.push(node.right);
            }

            if(node.left != null){
                stack.push(node.left);
            }
        }
        return res;
    }

}
