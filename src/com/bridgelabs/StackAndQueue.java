package com.bridgelabs;

import java.util.LinkedList;

public class StackAndQueue<E> {
    public static void main(String[] args) {
        System.out.println(" Welcome to Stack and Queue ");
        Stack stack = new Stack();
        stack.insert(70);
        stack.insert(30);
        stack.insert(56);
        stack.displayStack();
        stack.peak();
        stack.pop();
        stack.peak();
        stack.pop();
        stack.peak();
        stack.pop();
        stack.displayStack();
    }
}
