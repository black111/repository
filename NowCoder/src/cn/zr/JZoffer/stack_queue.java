package cn.zr.JZoffer;

import java.util.Stack;

public class stack_queue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int result;
        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.lastElement());
                stack1.pop();
            }

        }
        result = stack2.lastElement();
        stack2.pop();
        return result;
    }
}
