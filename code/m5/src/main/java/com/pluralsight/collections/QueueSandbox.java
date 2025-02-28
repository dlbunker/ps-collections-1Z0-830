package com.pluralsight.collections;


import java.util.*;

public class QueueSandbox {
    public static void main(String[] args) {
        QueueSandbox sandbox = new QueueSandbox();
        sandbox.digTheSand();
    }

    private void digTheSand(){
        Queue<String> queue = new LinkedList<>(); // Can also use PriorityQueue
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println(queue.poll()); // Alice (First In, First Out)
        System.out.println(queue.poll()); // Bob

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");

        System.out.println(deque.pollFirst()); // Front
        System.out.println(deque.pollLast());  // Back

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);

        System.out.println(pq.poll()); // 10 (smallest element first)
        System.out.println(pq.poll()); // 30
        System.out.println(pq.poll()); // 50

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
        maxPQ.offer(50);
        maxPQ.offer(10);
        maxPQ.offer(30);

        System.out.println(maxPQ.poll()); // 50 (largest element first)
        System.out.println(maxPQ.poll()); // 30
        System.out.println(maxPQ.poll()); // 10

    }
}
