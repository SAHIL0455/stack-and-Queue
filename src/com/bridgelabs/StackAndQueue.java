package com.bridgelabs;

import java.util.LinkedList;

public class StackAndQueue<E> {
    public static void main(String[] args) {
        System.out.println(" Welcome to Stack and Queue ");
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.addFirst(70);
        stack.addFirst(30);
        stack.addFirst(56);
        System.out.println(stack);
    }
}
