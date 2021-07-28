package com.wxj.leetCode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的后序遍历
 */
public class postorderTraversal {

    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {

        if(root == null){
            return  list;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }


    // 第二种
    public List<Integer> postorderTraversal2(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if(root == null){
            return  list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left != null){
                stack.push(node.left);
            }

            if(node.right != null){
                stack.push(node.right);
            }

            list.add(0,node.val); // //逆序添加结点值
        }
        return list;
    }

}
