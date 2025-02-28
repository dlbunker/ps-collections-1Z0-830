package com.pluralsight.collections;

import java.util.*;

public class CollectionsSandbox {
    public static void main(String[] args) {
        CollectionsSandbox collectionsSandbox = new CollectionsSandbox();
        collectionsSandbox.collectionsTest();
    }

    private void collectionsTest(){
        Collection<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Iterate using enhanced for-loop
        for (String name : names) {
            System.out.println(name);
        }

        Map<Integer, String> idMap = new HashMap<>();
        idMap.put(1, "Alice");
        idMap.put(2, "Bob");
        idMap.put(3, "Charlie");

        // Iterate using forEach (Lambda)
        idMap.forEach((id, name) -> System.out.println(id + ": " + name));

    }
}
