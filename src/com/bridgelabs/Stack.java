package com.bridgelabs;

import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> stack = new LinkedList<Integer>();

    public void insert(Integer key) {
        stack.addFirst(key);
    }

    public void pop() {
        if (stack.size() == 0) {
            System.out.println("stack is empty");
        } else {
            stack.pop();
            System.out.println("Delete the last element");
        }
    }

    public void peak() {
        System.out.println("stack list in peak is " + stack.peek());
    }

    public void displayStack() {
        if (stack.size() == 0) {
            System.out.println("Stack list is null");
        } else {
            System.out.println("Stack list is :");
            for (Integer i : stack) {
                System.out.println(" " + i);
            }
        }
    }
}
