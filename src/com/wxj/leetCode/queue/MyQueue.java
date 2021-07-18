package com.wxj.leetCode.queue;

import java.util.Stack;

/**
 * 用栈实现队列
 */
public class MyQueue {

    Stack<Integer> popStack;
    Stack<Integer> pushStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        popStack = new Stack<>();
        pushStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        pushStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // 如果popStack 为空，则将pushStack的元素全部弹栈并
        // 压入 如果popStack,然后如果popStack.pop();
       if(popStack.isEmpty()){
           while (!pushStack.isEmpty()){
               popStack.push(pushStack.pop());
           }
       }
       return popStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(popStack.isEmpty()){
            while (!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }
        return popStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}
