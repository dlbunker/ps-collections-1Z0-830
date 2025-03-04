package com.pluralsight.collections;

import java.util.*;

public class HashSetSandbox {
    public static void main(String[] args) {
        HashSetSandbox sandbox = new HashSetSandbox();
        sandbox.digTheSand();
    }

    private void digTheSand(){
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");  // Duplicate!
        System.out.println(names);

        names.remove("Bob");
        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.contains("Charlie"));  // true
        System.out.println(names.contains("David"));   // false

        List<String> nameList = new ArrayList<>(names);
        System.out.println(nameList);

        List<String> duplicateList = Arrays.asList("A", "B", "A", "C");
        Set<String> uniqueNames = new HashSet<>(duplicateList);
        System.out.println(uniqueNames);  // Duplicates removed

    }
}
