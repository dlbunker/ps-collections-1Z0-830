package com.pluralsight.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingSandbox {
    public static void main(String[] args) {
        SortingSandbox sandbox = new SortingSandbox();
        sandbox.digTheSand();
    }

    private void digTheSand(){
        List<String> names = new ArrayList<>(List.of("Zoe", "Alex", "John", "Mia"));
        System.out.println("Before sorting: " + names);

        Collections.sort(names); // Sorts in natural order (A-Z)
        System.out.println("After sorting: " + names);

        List<Person> people = new ArrayList<>(List.of(
                new Person("Zoe", 25),
                new Person("Alex", 30),
                new Person("John", 20)
        ));

        System.out.println("Before sorting: " + people);
        Collections.sort(people);
        System.out.println("After sorting: " + people);

        Collections.sort(people, Comparator.comparing(person -> person.name));

    }
}
