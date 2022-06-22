package com.bridgelabs;

import java.util.LinkedList;

public class Queues {
    LinkedList<Integer> queses = new LinkedList<Integer>();

    public void enqueue(Integer key) {
        queses.add(key);
    }

    public void printQueues() {
        System.out.println(queses);
    }
}
