package com.company.adapter;

import java.util.Stack;

public class StackAdapter extends Stack<Integer> implements AdapterInterface {
    private final Stack<Integer> stack;

    public StackAdapter(Stack<Integer> stack) {
        this.stack = stack;
    }

    public Integer pop() {
        return stack.pop();
    }

    public void push(int element) {
        stack.push(element);
    }
}
