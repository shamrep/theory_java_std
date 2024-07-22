package org.theory.collections_std;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();

        System.out.println("________ArrayDeque________");
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("f");
        arrayDeque.addLast("l");

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.peek());



        System.out.println("________LinkedListDeque_________");
        Deque<String> linkedListDeque = new LinkedList<>();

        priorityQueue.add("a");
        priorityQueue.add("c");
        priorityQueue.add("n");
        priorityQueue.add("e");
        priorityQueue.add("p");

        System.out.println(priorityQueue);
    }
}
