package com.pluralsight.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListSandbox {
    public static void main(String[] args) {
        LinkedListSandbox sandbox = new LinkedListSandbox();
        sandbox.digTheSand();
    }

    private void digTheSand(){
        List<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println(names);

        names.addFirst("Zoe");  // Adds at the front
        names.addLast("Daniel"); // Adds at the end
        System.out.println(names);

        names.remove(1); // Removes "Alice"
        names.removeFirst(); // Removes "Zoe"
        names.removeLast();  // Removes "Daniel"
        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("C")) {
                iterator.remove();  // Removes "Charlie"
            }
        }
        System.out.println(names);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.poll()); // Removes and prints 10
        System.out.println(queue.poll()); // Removes and prints 20

    }
}
