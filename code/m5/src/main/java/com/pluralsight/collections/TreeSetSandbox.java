package com.pluralsight.collections;

import java.util.*;

public class TreeSetSandbox {
    public static void main(String[] args) {
        TreeSetSandbox sandbox = new TreeSetSandbox();
        sandbox.digTheSand();
    }

    private void digTheSand(){
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        numbers.add(3);
        numbers.add(3);  // Duplicate, ignored
        System.out.println(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println(((TreeSet<Integer>) numbers).descendingSet());

        System.out.println(numbers.contains(3));  // true
        System.out.println(numbers.contains(10)); // false

        Set<String> names = new TreeSet<>(Comparator.reverseOrder());  // Sorts in descending order
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println(names);

//        Set<Integer> set = new TreeSet<>();
//        set.add(null);  // Throws NullPointerException!

        List<Integer> numberList = new ArrayList<>(numbers);
        System.out.println(numberList);

        List<Integer> randomNumbers = Arrays.asList(9, 2, 5, 2, 9);
        Set<Integer> sortedUniqueNumbers = new TreeSet<>(randomNumbers);
        System.out.println(sortedUniqueNumbers);

    }
}
