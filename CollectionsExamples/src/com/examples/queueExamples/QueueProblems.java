package com.examples.queueExamples;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProblems {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>(new QueueComparator());
        integerQueue.add(10);
        integerQueue.add(2);
        integerQueue.add(4);

        System.out.println(integerQueue); // Will print in internal heap order, not necessarily sorted

        /*
        PriorityQueue is a heap-based data structure — toString() doesn't return elements in sorted order.
        The actual priority order is visible when you poll elements from the queue.
         */

        while (!integerQueue.isEmpty()) {
            System.out.println(integerQueue.poll());
        }
        List<Integer> integerList = List.of(5, 10, 1, 4, 90);
        integerQueue.addAll(integerList);
        while (!integerQueue.isEmpty()) {
            System.out.println(integerQueue.poll());
        }
    }
}
