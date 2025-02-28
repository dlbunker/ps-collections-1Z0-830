package com.pluralsight.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchSandbox {
    public static void main(String[] args) {
        BinarySearchSandbox sandbox = new BinarySearchSandbox();
        sandbox.digTheSand();
    }

    private void digTheSand(){
        List<String> names = new ArrayList<>(List.of("Zoe", "Alex", "John", "Mia"));
        Collections.sort(names); // Must sort before searching
        System.out.println("Sorted list: " + names);

        int index = Collections.binarySearch(names, "John");
        System.out.println("Index of 'John': " + index);

        int missingIndex = Collections.binarySearch(names, "David");
        System.out.println("Index of 'David': " + missingIndex); // Negative value

        List<Person> people = new ArrayList<>(List.of(
                new Person("Zoe", 25),
                new Person("Alex", 30),
                new Person("John", 20)
        ));

        Collections.sort(people); // Sort by age before searching
        System.out.println("Sorted people: " + people);

        int personIndex = Collections.binarySearch(people, new Person("", 25));
        System.out.println("Index of age 25: " + personIndex);

    }
}
